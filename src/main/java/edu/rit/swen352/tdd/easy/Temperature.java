package edu.rit.swen352.tdd.easy;


/**
 * An temperature measurement.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor:
 *     <ul>
 *       <li>with both a value as {@code double} and a unit</li>
 *       <li>with just a value; unit is defaulted to {@link TemperatureUnit#CELSIUS}</li>
 *       <li>NOTE: no temperature may be below absolute zero</li>
 *     </ul>
 *   </li>
 *   <li>convertTo(unit): create a new Temperature in the new unit</li>
 * </ul>
 */
public class Temperature {
  public enum TemperatureUnit {
    CELSIUS, FAHRENHEIT, KELVIN;
  }
  private double value;
  private TemperatureUnit unit;

  public Temperature(double value, TemperatureUnit unit) {
    if (unit == TemperatureUnit.CELSIUS && value < -273.15) {
      throw new IllegalArgumentException("Temperature below absolute zero");
    }
    if (unit == TemperatureUnit.FAHRENHEIT && value < -459.67) {
      throw new IllegalArgumentException("Temperature below absolute zero");
    }
    if (unit == TemperatureUnit.KELVIN && value < 0) {
      throw new IllegalArgumentException("Temperature below absolute zero");
    }
    this.value = value;
    this.unit = unit;
  }

  public Temperature(double value) {
    this(value, TemperatureUnit.CELSIUS);
  }

  public Temperature convertTo(TemperatureUnit targetUnit) {
    if (this.unit == targetUnit) {
      return new Temperature(this.value, this.unit);
    }

    if (this.unit == TemperatureUnit.CELSIUS && targetUnit == TemperatureUnit.FAHRENHEIT) {
      return new Temperature((this.value * 9.0/5.0) + 32, TemperatureUnit.FAHRENHEIT);
    }

    throw new UnsupportedOperationException("Conversion not yet implemented");
  }

}
