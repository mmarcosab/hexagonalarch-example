package com.hexagonalarch.app.infrastructure.repository;

import com.hexagonalarch.app.infrastructure.data.AnimalData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataAnimalRepository extends MongoRepository<AnimalData, UUID> {

}
