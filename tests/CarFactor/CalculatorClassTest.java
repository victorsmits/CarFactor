package CarFactor;

import org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class CalculatorClassTest {

  @Test
  void assuranceCalcul() {
    int power = 25;
    int catalogueValue = 5000;
    int assurancePrice = 54;
    assertEquals(assurancePrice, assuranceCalcul(catalogueValue, power));
  }

  @Test
  void taxeCalcul() {
  }

  @Test
  void energyConsumptionCalcul() {
  }

  @Test
  void annualConsumptionCalcul() {
  }
}