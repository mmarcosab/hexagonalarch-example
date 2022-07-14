package com.hexagonalarch.app.application.request;

import com.hexagonalarch.app.domain.Animal;
import com.sun.istack.NotNull;

public class CreateAnimalRequest {

    @NotNull
    private Animal animal;

    public CreateAnimalRequest(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

}
