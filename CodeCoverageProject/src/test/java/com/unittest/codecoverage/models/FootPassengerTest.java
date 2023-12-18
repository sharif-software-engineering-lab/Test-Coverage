package com.unittest.codecoverage.models;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FootPassengerTest {

    private Footpassenger pedestrian;

    @BeforeEach
    public void initialize() {
        pedestrian = new Footpassenger();
    }

    @Test
    public void crossingCrosswalk_SetsCrossedToTrue_ExpectTrue() {
        // Arrange
        pedestrian.setCrossedTheCrosswalk(true);

        // Act
        boolean hasCrossed = pedestrian.crossedTheCrosswalk();

        // Assert
        assertTrue(hasCrossed);
    }
}
