package com.unittest.codecoverage.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrafficTest {

    private Traffic traffic;

    @BeforeEach
    public void setUp() {
        traffic = new Traffic();
    }

    @Test
    public void setCurrentTrafficLight_Yellow_SetsCurrentTrafficLight() {
        // Arrange & Act
        traffic.setCurrentTrafficLight(TrafficLigth.YELLOW);

        // Assert
        assertEquals(TrafficLigth.YELLOW, traffic.getCurrentTrafficLight());
    }

    @Test
    public void setIntenseCarTraffic_True_SetsIntenseCarTraffic() {
        // Arrange & Act
        traffic.setIntenseCarTraffic(true);

        // Assert
        assertEquals(true, traffic.intenseCarTraffic());
    }

    @Test
    public void setMaxSpeedAllowed_60_SetsMaxSpeed() {
        // Arrange & Act
        traffic.setMaxSpeedAllowed((short) 60);

        // Assert
        assertEquals(60, traffic.getMaxSpeedAllowed());
    }

    @Test
    public void setMinSpeedAllowed_20_SetsMinSpeed() {
        // Arrange & Act
        traffic.setMinSpeedAllowed((short) 20);

        // Assert
        assertEquals(20, traffic.getMinSpeedAllowed());
    }

    @Test
    public void setStreetDirectionFlow_OneWay_SetsStreetDirectionFlow() {
        // Arrange & Act
        traffic.setStreetDirectionFlow(StreetDirectionFlow.ONE_WAY);

        // Assert
        assertEquals(StreetDirectionFlow.ONE_WAY, traffic.getStreetDirectionFlow());
    }

    @Test
    public void setStreetDirectionFlow_TwoWay_SetsStreetDirectionFlow() {
        // Arrange & Act
        traffic.setStreetDirectionFlow(StreetDirectionFlow.TWO_WAY);

        // Assert
        assertEquals(StreetDirectionFlow.TWO_WAY, traffic.getStreetDirectionFlow());
    }
}
