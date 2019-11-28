package carFactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionEmissionTest {

  @Test
  void testIsValid() {

    CriterionEmission criterionEmissionTest1 = new CriterionEmission(125);
    CriterionEmission criterionEmissionTest2 = new CriterionEmission(123);
    CriterionEmission criterionEmissionTest3 = new CriterionEmission(120);
    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);

    assertTrue(criterionEmissionTest1.isValid(car));
    assertTrue(criterionEmissionTest2.isValid(car));
    assertFalse(criterionEmissionTest3.isValid(car));
  }
}