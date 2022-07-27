package com.hexagonalarch.app.infrastructure.database.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "animal")
public class AnimalData {

    @Id
    @Column( name = "id", columnDefinition = "varchar(36)" )
    private String id;
    private String name;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    private String breed;
    private String color;
    private String kind;

    public AnimalData() {
    }

    public AnimalData(UUID id, String name, LocalDate birthDate, String breed, String color, String kind) {
        this.id = id.toString();
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
        this.color = color;
        this.kind = kind;
    }

    public UUID getId() {
        return UUID.fromString(id);
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
        this.id = id.toString();
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
