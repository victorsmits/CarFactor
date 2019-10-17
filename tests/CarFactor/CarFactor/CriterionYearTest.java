package CarFactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionYearTest {



  @Test
  void testIsValid() {

    CriterionYear criterionYearTest1 = new CriterionYear(2019);
    CriterionYear criterionYearTest2 = new CriterionYear(2018);
    CriterionYear criterionYearTest3 = new CriterionYear(2016, 2019);
    CriterionYear criterionYearTest4 = new CriterionYear(2016, 2018);
    CriterionYear criterionYearTest5 = new CriterionYear(2020, 2021);
    CriterionYear criterionYearTest6 = new CriterionYear(2020);
    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);

    assertTrue(criterionYearTest1.isValid(car));
    assertTrue(criterionYearTest2.isValid(car));
    assertTrue(criterionYearTest3.isValid(car));
    assertFalse(criterionYearTest4.isValid(car));
    assertFalse(criterionYearTest5.isValid(car));
    assertFalse(criterionYearTest6.isValid(car));

  }
}