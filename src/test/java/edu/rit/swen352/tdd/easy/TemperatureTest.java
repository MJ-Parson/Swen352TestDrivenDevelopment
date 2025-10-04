package edu.rit.swen352.tdd.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link Temperature} component.
 */
class TemperatureTest {

    @Test
    @DisplayName("1a: Construct Temperature with value and unit (Celsius)")
    void testConstructorWithCelsius() {
        Temperature temp = new Temperature(25.0, Temperature.TemperatureUnit.CELSIUS);
        assertNotNull(temp);
    }


}
//Test