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

    @Test
    @DisplayName("1b: Construct Temperature with value and unit (Fahrenheit)")
    void testConstructorWithFahrenheit() {
        Temperature temp = new Temperature(77.0, Temperature.TemperatureUnit.FAHRENHEIT);
        assertNotNull(temp);
    }

    @Test
    @DisplayName("1c: Construct Temperature with value and unit (Kelvin)")
    void testConstructorWithKelvin() {
        Temperature temp = new Temperature(298.15, Temperature.TemperatureUnit.KELVIN);
        assertNotNull(temp);
    }

    @Test
    @DisplayName("1d: Construct Temperature with value only (defaults to Celsius)")
    void testConstructorDefaultUnit() {
        Temperature temp = new Temperature(25.0);
        assertNotNull(temp);
    }

    @Test
    @DisplayName("2: Reject temperature below absolute zero in Celsius")
    void testRejectBelowAbsoluteZeroCelsius() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Temperature(-300.0, Temperature.TemperatureUnit.CELSIUS);
        });
    }

    @Test
    @DisplayName("3: Reject temperature below absolute zero in Fahrenheit")
    void testRejectBelowAbsoluteZeroFahrenheit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Temperature(-500.0, Temperature.TemperatureUnit.FAHRENHEIT);
        });
    }

    @Test
    @DisplayName("4: Reject temperature below absolute zero in Kelvin")
    void testRejectBelowAbsoluteZeroKelvin() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Temperature(-1.0, Temperature.TemperatureUnit.KELVIN);
        });
    }

    @Test
    @DisplayName("5: Convert Celsius to Fahrenheit")
    void testConvertCelsiusToFahrenheit() {
        Temperature celsius = new Temperature(0.0, Temperature.TemperatureUnit.CELSIUS);
        Temperature fahrenheit = celsius.convertTo(Temperature.TemperatureUnit.FAHRENHEIT);
        assertNotNull(fahrenheit);
    }

    @Test
    @DisplayName("6: Convert Celsius to Kelvin")
    void testConvertCelsiusToKelvin() {
        Temperature celsius = new Temperature(0.0, Temperature.TemperatureUnit.CELSIUS);
        Temperature kelvin = celsius.convertTo(Temperature.TemperatureUnit.KELVIN);
        assertNotNull(kelvin);
    }

    @Test
    @DisplayName("7: Convert Fahrenheit to Celsius")
    void testConvertFahrenheitToCelsius() {
        Temperature fahrenheit = new Temperature(32.0, Temperature.TemperatureUnit.FAHRENHEIT);
        Temperature celsius = fahrenheit.convertTo(Temperature.TemperatureUnit.CELSIUS);
        assertNotNull(celsius);
    }

    @Test
    @DisplayName("8: Convert Fahrenheit to Kelvin")
    void testConvertFahrenheitToKelvin() {
        Temperature fahrenheit = new Temperature(32.0, Temperature.TemperatureUnit.FAHRENHEIT);
        Temperature kelvin = fahrenheit.convertTo(Temperature.TemperatureUnit.KELVIN);
        assertNotNull(kelvin);
    }

    @Test
    @DisplayName("9: Convert Kelvin to Celsius")
    void testConvertKelvinToCelsius() {
        Temperature kelvin = new Temperature(273.15, Temperature.TemperatureUnit.KELVIN);
        Temperature celsius = kelvin.convertTo(Temperature.TemperatureUnit.CELSIUS);
        assertNotNull(celsius);
    }

    @Test
    @DisplayName("10: Convert Kelvin to Fahrenheit")
    void testConvertKelvinToFahrenheit() {
        Temperature kelvin = new Temperature(273.15, Temperature.TemperatureUnit.KELVIN);
        Temperature fahrenheit = kelvin.convertTo(Temperature.TemperatureUnit.FAHRENHEIT);
        assertNotNull(fahrenheit);
    }




}
