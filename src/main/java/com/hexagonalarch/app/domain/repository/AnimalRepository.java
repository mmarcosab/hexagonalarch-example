package com.hexagonalarch.app.domain.repository;

import com.hexagonalarch.app.domain.Animal;
import java.util.Optional;
import java.util.UUID;


public interface AnimalRepository {
    Optional<Animal> findById(UUID id);
    void save(Animal animal);
    void deledeAnimalById(UUID id);
}
