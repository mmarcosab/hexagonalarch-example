package com.hexagonalarch.app.domain.service;


import com.hexagonalarch.app.domain.Animal;
import com.hexagonalarch.app.domain.repository.AnimalRepository;

import java.util.Optional;


public class DomainAnimalService implements AnimalService {

    private final AnimalRepository animalRepository;

    public DomainAnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Optional<Animal> findById(Integer id) {
        return animalRepository.findById(id);
    }

    @Override
    public Integer createAnimal(Animal animal) {
        animalRepository.save(animal);
        return animal.getId();
    }

}
