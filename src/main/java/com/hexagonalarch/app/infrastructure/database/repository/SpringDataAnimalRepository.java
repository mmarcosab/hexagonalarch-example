package com.hexagonalarch.app.infrastructure.database.repository;

import com.hexagonalarch.app.infrastructure.database.data.AnimalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataAnimalRepository extends JpaRepository<AnimalData, String> {

}
