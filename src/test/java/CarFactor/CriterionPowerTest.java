package carfactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionPowerTest {

  @Test
  void testIsValid() {
    CriterionPower criterionPowerTest1 = new CriterionPower(100, 150);
    CriterionPower criterionPowerTest2 = new CriterionPower(110, 150);
    CriterionPower criterionPowerTest3 = new CriterionPower(100, 110);
    CriterionPower criterionPowerTest4 = new CriterionPower(80, 100);
    CriterionPower criterionPowerTest5 = new CriterionPower(120, 150);

    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);

    assertTrue(criterionPowerTest1.isValid(car));
    assertTrue(criterionPowerTest2.isValid(car));
    assertTrue(criterionPowerTest3.isValid(car));
    assertFalse(criterionPowerTest4.isValid(car));
    assertFalse(criterionPowerTest5.isValid(car));
  }
}