package com.hexagonalarch.app.infrastructure.repository;

import com.hexagonalarch.app.domain.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataAnimalRepository extends MongoRepository<Animal, Integer> {

}
