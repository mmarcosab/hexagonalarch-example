package com.hexagonalarch.app.application.controller;

import com.hexagonalarch.app.application.request.CreateAnimalRequest;
import com.hexagonalarch.app.domain.service.AnimalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/v1/animals")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping
    public ResponseEntity<?> createAnimal(@RequestBody CreateAnimalRequest createAnimalRequest){
        var response = animalService.createAnimal(createAnimalRequest.getAnimal());
        return ResponseEntity.created(URI.create("v1/animals/{}" + response.toString())).build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findAnimalById(@PathVariable Integer id){
        return ResponseEntity.ok(animalService.findById(id));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteAnimalById(@PathVariable Integer id){
        animalService.deleteAnimalById(id);
        return ResponseEntity.ok(animalService.findById(id));
    }

}
