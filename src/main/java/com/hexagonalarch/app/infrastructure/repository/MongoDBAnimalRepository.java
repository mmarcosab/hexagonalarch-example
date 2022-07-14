package com.hexagonalarch.app.infrastructure.repository;

import com.hexagonalarch.app.domain.Animal;
import com.hexagonalarch.app.domain.repository.AnimalRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MongoDBAnimalRepository implements AnimalRepository {

    private final SpringDataAnimalRepository springDataAnimalRepository;

    public MongoDBAnimalRepository(SpringDataAnimalRepository springDataAnimalRepository) {
        this.springDataAnimalRepository = springDataAnimalRepository;
    }

    @Override
    public Optional<Animal> findById(Integer id) {
        return springDataAnimalRepository.findById(id);
    }

    @Override
    public void save(Animal animal) {
        springDataAnimalRepository.save(animal);
    }

    @Override
    public void deledeAnimalById(Integer id) {
        springDataAnimalRepository.deleteById(id);
    }

}
