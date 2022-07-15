package com.hexagonalarch.app.domain.service;


import com.hexagonalarch.app.domain.Animal;
import java.util.Optional;
import java.util.UUID;

public interface AnimalService {
    Optional<Animal> findById(UUID id);
    UUID createAnimal(Animal animal);
    void deleteAnimalById(UUID id);
}
