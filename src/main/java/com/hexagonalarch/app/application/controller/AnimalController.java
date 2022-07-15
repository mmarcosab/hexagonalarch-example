package com.hexagonalarch.app.application.controller;

import com.hexagonalarch.app.application.request.CreateAnimalRequest;
import com.hexagonalarch.app.application.response.CreateAnimalResponse;
import com.hexagonalarch.app.domain.Animal;
import com.hexagonalarch.app.domain.service.AnimalService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/v1/animals")
public class AnimalController {

    private final AnimalService animalService;
    private final ModelMapper modelMapper;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
        this.modelMapper = new ModelMapper();
    }

    @PostMapping
    public ResponseEntity<?> createAnimal(@RequestBody CreateAnimalRequest createAnimalRequest) throws Exception {
        var domainAnimal =  new Animal(createAnimalRequest.getName(), createAnimalRequest.getBirthDate(), createAnimalRequest.getBreed(),
                createAnimalRequest.getColor(), createAnimalRequest.getKind());
        var response = animalService.createAnimal(domainAnimal);
        return ResponseEntity.created(URI.create("v1/animals/" + response.toString())).build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findAnimalById(@PathVariable String id){
        var animalOptional = animalService.findById(UUID.fromString(id));
        if(animalOptional.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(modelMapper.map(animalOptional.get(), CreateAnimalResponse.class));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteAnimalById(@PathVariable String id){
        animalService.deleteAnimalById(UUID.fromString(id));
        return ResponseEntity.noContent().build();
    }

}
