
package CarFactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionConsumptionTest {

  @Test
  void testIsValid() {

    CriterionConsumption criterionConsumptionTest1 = new CriterionConsumption(5.2);
    CriterionConsumption criterionConsumptionTest2 = new CriterionConsumption(5);
    CriterionConsumption criterionConsumptionTest3 = new CriterionConsumption(4.9);
    CriterionConsumption criterionConsumptionTest4 = new CriterionConsumption(4.5);
    CriterionConsumption criterionConsumptionTest5 = new CriterionConsumption(4);
    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);

    assertTrue(criterionConsumptionTest1.isValid(car));
    assertTrue(criterionConsumptionTest2.isValid(car));
    assertTrue(criterionConsumptionTest3.isValid(car));
    assertFalse(criterionConsumptionTest4.isValid(car));
    assertFalse(criterionConsumptionTest5.isValid(car));
  }
}