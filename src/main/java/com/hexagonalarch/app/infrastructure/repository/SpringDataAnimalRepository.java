package com.hexagonalarch.app.infrastructure.repository;

import com.hexagonalarch.app.infrastructure.data.AnimalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataAnimalRepository extends JpaRepository<AnimalData, String> {

}
