package carfactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionNormTest {

  @Test
  void testIsValid() {

    CriterionNorm criterionNormTest1 = new CriterionNorm(6);
    CriterionNorm criterionNormTest2 = new CriterionNorm(7);
    CriterionNorm criterionNormTest3 = new CriterionNorm(5);
    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);

    assertTrue(criterionNormTest1.isValid(car));
    assertTrue(criterionNormTest2.isValid(car));
    assertFalse(criterionNormTest3.isValid(car));
  }
}