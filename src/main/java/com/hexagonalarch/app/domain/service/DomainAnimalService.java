package com.hexagonalarch.app.domain.service;


import com.hexagonalarch.app.domain.Animal;
import com.hexagonalarch.app.domain.repository.AnimalRepository;

import java.util.Optional;
import java.util.UUID;


public class DomainAnimalService implements AnimalService {

    private final AnimalRepository animalRepository;

    public DomainAnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Optional<Animal> findById(UUID id) {
        var animal = animalRepository.findById(id);
        return animal;
    }

    @Override
    public UUID createAnimal(Animal animal) {
        animalRepository.save(animal);
        return animal.getId();
    }

    @Override
    public void deleteAnimalById(UUID id){
        animalRepository.deledeAnimalById(id);
    }

}
