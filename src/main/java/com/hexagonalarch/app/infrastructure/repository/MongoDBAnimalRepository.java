package com.hexagonalarch.app.infrastructure.repository;

import com.hexagonalarch.app.domain.Animal;
import com.hexagonalarch.app.domain.repository.AnimalRepository;
import com.hexagonalarch.app.infrastructure.data.AnimalData;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class MongoDBAnimalRepository implements AnimalRepository {

    private final SpringDataAnimalRepository springDataAnimalRepository;
    private final ModelMapper modelMapper;

    public MongoDBAnimalRepository(SpringDataAnimalRepository springDataAnimalRepository) {
        this.springDataAnimalRepository = springDataAnimalRepository;
        this.modelMapper = new ModelMapper();
        this.modelMapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);

    }

    @Override
    public Optional<Animal> findById(UUID id) {
        var animalData = springDataAnimalRepository.findById(id);
        if(animalData.isEmpty())
            return Optional.empty();
        var domainAnimal = modelMapper.map(animalData.get(), Animal.class);
        return Optional.of(domainAnimal);

    }

    @Override
    public void save(Animal animal) {
        var animalData = modelMapper.map(animal, AnimalData.class);
        springDataAnimalRepository.save(animalData);
    }

    @Override
    public void deledeAnimalById(UUID id) {
        springDataAnimalRepository.deleteById(id);
    }

}
