package com.hexagonalarch.app.infrastructure.rest.response;

import java.time.LocalDate;
import java.util.UUID;

public class CreateAnimalResponse {

    private UUID id;
    private String name;
    private LocalDate birthDate;
    private String breed;
    private String color;
    private String kind;

    public CreateAnimalResponse(UUID id, String name, LocalDate birthDate, String breed, String color, String kind) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
        this.color = color;
        this.kind = kind;
    }

    public CreateAnimalResponse() {
    }

    public UUID getId() {
        return id;
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

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
