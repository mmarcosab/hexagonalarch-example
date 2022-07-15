package com.hexagonalarch.app.domain.service;

import com.hexagonalarch.app.domain.Animal;
import com.hexagonalarch.app.domain.repository.AnimalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DomainAnimalServiceTest {

    private AnimalRepository animalRepository;
    private DomainAnimalService domainAnimalService;

    @BeforeEach
    public void init() {
        animalRepository = mock(AnimalRepository.class);
        domainAnimalService = new DomainAnimalService(animalRepository);
    }

    @Test
    public void testFindByIdOK() throws Exception {
        Mockito.when(animalRepository.findById(any())).thenReturn(Optional.of(mockAnimal()));
        var animal = domainAnimalService.findById(UUID.fromString("ef3d435b-5045-48b2-a568-e3d13bb5c35b"));
        assertTrue(animal.isPresent());
    }

    @Test
    public void testFindByIdNotFound() throws Exception {
        var animal = domainAnimalService.findById(UUID.fromString("ef3d435b-5045-48b2-a568-e3d13bb5c35b"));
        assertTrue(animal.isEmpty());
    }

    @Test
    public void createAnimal(){
        assertDoesNotThrow(() -> domainAnimalService.createAnimal(mockAnimal()));
    }

    @Test
    public void tesDeleteyId(){
        assertDoesNotThrow(() -> domainAnimalService.deleteAnimalById(UUID.fromString("ef3d435b-5045-48b2-a568-e3d13bb5c35b")));
    }

    private Animal mockAnimal() throws Exception {
        return new Animal("test", LocalDate.now(), "siames", "white", "cat");
    }

}
