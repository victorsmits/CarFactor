package carFactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionFuelTest {

  @Test
  void testIsValid() {

    CriterionFuel criterionFuelTest1 = new CriterionFuel("Diesel");
    CriterionFuel criterionFuelTest2 = new CriterionFuel("Petrol");
    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);

    assertTrue(criterionFuelTest1.isValid(car));
    assertFalse(criterionFuelTest2.isValid(car));
  }
}