package CarFactor;

import CarFactor.CarClass;
import CarFactor.CriterionPrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionPriceTest {

  @Test
  void testIsValid() {
    CriterionPrice criterionPriceTest1 = new CriterionPrice(87000);
    CriterionPrice criterionPriceTest2 = new CriterionPrice(20000);
    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);

    assertTrue(criterionPriceTest1.isValid(car));
    assertFalse(criterionPriceTest2.isValid(car));

  }
}