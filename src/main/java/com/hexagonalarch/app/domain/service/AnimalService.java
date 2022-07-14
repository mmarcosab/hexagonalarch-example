package com.hexagonalarch.app.domain.service;


import com.hexagonalarch.app.domain.Animal;
import java.util.Optional;

public interface AnimalService {
    Optional<Animal> findById(Integer id);
    Integer createAnimal(Animal animal);
    void deleteAnimalById(Integer id);
}
