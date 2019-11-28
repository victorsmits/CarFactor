package carFactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionMileageTest {

  @Test
  void testIsValid() {

    CriterionMileage criterionMileageTest1 = new CriterionMileage(0,100000);
    CriterionMileage criterionMileageTest2 = new CriterionMileage(0,24000);
    CriterionMileage criterionMileageTest3 = new CriterionMileage(24000,100000);
    CriterionMileage criterionMileageTest4 = new CriterionMileage(50000,100000);
    CriterionMileage criterionMileageTest5 = new CriterionMileage(0,20000);
    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);

    assertTrue(criterionMileageTest1.isValid(car));
    assertTrue(criterionMileageTest2.isValid(car));
    assertTrue(criterionMileageTest3.isValid(car));
    assertFalse(criterionMileageTest4.isValid(car));
    assertFalse(criterionMileageTest5.isValid(car));
  }


}