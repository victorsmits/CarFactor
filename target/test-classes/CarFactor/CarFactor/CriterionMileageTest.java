package CarFactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionMileageTest {

  @Test
  void testIsValid() {

    CriterionMileage criterionMileageTest1 = new CriterionMileage(0,100000);

    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);
  }
}