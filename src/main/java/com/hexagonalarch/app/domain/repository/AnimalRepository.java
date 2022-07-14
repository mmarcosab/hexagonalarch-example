package com.hexagonalarch.app.domain.repository;

import com.hexagonalarch.app.domain.Animal;
import java.util.Optional;


public interface AnimalRepository {
    Optional<Animal> findById(Integer id);
    void save(Animal animal);
    void deledeAnimalById(Integer id);
}
