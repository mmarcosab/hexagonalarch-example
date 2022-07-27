package com.hexagonalarch.app.infrastructure.rest.request;

import java.time.LocalDate;

public class CreateAnimalRequest {

    private String name;
    private LocalDate birthDate;
    private String breed;
    private String color;
    private String kind;

    public CreateAnimalRequest() {
    }

    public CreateAnimalRequest(String name, LocalDate birthDate, String breed, String color, String kind) {
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
        this.color = color;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getKind() {
        return kind;
    }
}
