package com.unittest.codecoverage.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    private Person individual;

    @BeforeEach
    public void initialize() {
        individual = new Person();
    }

    @Test
    public void whenAgeIsSetTo20_getAgeShouldReturn20() {
        // Arrange
        individual.setAge(20);

        // Act
        int retrievedAge = individual.getAge();

        // Assert
        assertEquals(20, retrievedAge);
    }
}
