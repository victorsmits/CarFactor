package carfactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionBuyYearTest {

  @Test
  void testIsValid() {

    CriterionBuyYear criterionBuyYearTest1 = new CriterionBuyYear(2010, 2020);
    CriterionBuyYear criterionBuyYearTest2 = new CriterionBuyYear(2019, 2020);
    CriterionBuyYear criterionBuyYearTest3 = new CriterionBuyYear(2010, 2019);
    CriterionBuyYear criterionBuyYearTest4 = new CriterionBuyYear(2020, 2021);
    CriterionBuyYear criterionBuyYearTest5 = new CriterionBuyYear(2000, 2018);
    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);

    assertTrue(criterionBuyYearTest1.isValid(car));
    assertTrue(criterionBuyYearTest2.isValid(car));
    assertTrue(criterionBuyYearTest3.isValid(car));
    assertFalse(criterionBuyYearTest4.isValid(car));
    assertFalse(criterionBuyYearTest5.isValid(car));
  }
}