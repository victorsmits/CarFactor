package CarFactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterionYearTest extends CriterionYear {


  CriterionYearTest(int yearMi, int yearMa) {
    super(yearMi, yearMa);
  }

  @Test
  void testIsValid() {

    CriterionYear criterionYearTest1 = new CriterionYear(2019);
    CriterionYear criterionYearTest2 = new CriterionYear(2018);
    CriterionYear criterionYearTest3 = new CriterionYear(2016, 2019);
    CriterionYear criterionYearTest4 = new CriterionYear(2016, 2018);
    CarClass car = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);
    ;
    assertTrue(criterionYearTest1.isValid(car));
    assertFalse(criterionYearTest2.isValid(car));
    assertTrue(criterionYearTest3.isValid(car));
    assertFalse(criterionYearTest4.isValid(car));

  }
}