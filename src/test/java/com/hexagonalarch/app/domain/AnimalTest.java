package com.hexagonalarch.app.domain;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    public void createNewAnimalRightWay(){
        assertDoesNotThrow(() -> new Animal("rex", LocalDate.now(), "pitbull", "black", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidBirthDate(){
        var birthDate = LocalDate.now().plusDays(1);
        assertThrows(InvalidAnimalAtributteException.class, () -> new Animal("rex", birthDate, "pitbull", "black", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidName(){
        assertThrows(InvalidAnimalAtributteException.class, () -> new Animal("", LocalDate.now().minusYears(1), "pitbull", "black", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidColor(){
        assertThrows(InvalidAnimalAtributteException.class, () -> new Animal("rex", LocalDate.now(), "pitbull", "    ", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidBreed(){
        assertThrows(InvalidAnimalAtributteException.class, () -> new Animal("rex", LocalDate.now().minusYears(1), "", "black", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidKind(){
        assertThrows(InvalidAnimalAtributteException.class, () -> new Animal("rex", LocalDate.now().minusYears(1), "pitbull", "black", null));
    }

    @Test
    public void assertIdIsNotNull() throws Exception {
        var animal = new Animal("rex", LocalDate.now().minusYears(1), "siames", "black", "cat");
        assertNotNull(animal.getId());
    }

}
