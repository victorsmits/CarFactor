package CarFactor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorClassTest {

  @Test
  void insuranceCalcul() {
    /*
    Current insurance function is not highly accurate, and just gives an approximation
      of real insurance price; a relative error of maximum 45% is allowed on the result
      (Maximum error on a given set of cars with given assurance prices).
     */
    //real values taken from the given set of cars
    int power = 155;
    int catalogueValue = 70855;
    int expectedPrice = 54*12; //expected assurance cost
    double admittedMargin = 0.55; // (margin is 1 - 0.45)
    double effectivePrice = CalculatorClass.insuranceCalcul(catalogueValue, power);
    if (effectivePrice > expectedPrice){
      assertTrue((expectedPrice/effectivePrice) >= admittedMargin,
                  "Invalid formula for insurance computation.");
    }
    else{
      assertTrue((effectivePrice/expectedPrice) >= admittedMargin,
                  "Invalid formula for insurance computation.");
    }
  }

  @Test
  void taxCalcul() {
    /* test based on values given here :
      https://www.mon-assurance-auto.be/taxes/taxe-circulation-auto-belgique.html
     */
    double[][] realValues = {{83.56,40, 70}, {151.14, 90, 90}, {437.45, 150, 100},
                          {637.96, 170, 120}, {1098.50, 190, 140},
                          {1618.58, 210, 140}, {2720.8, 270, 150}};
    for (int i = 0; i < realValues.length; i++){
      assertEquals(realValues[i][0], CalculatorClass.taxCalcul(realValues[i][1], realValues[i][2]),
                    "Inadequate tax computation formula.");
    }
  }

  @Test
  void energyConsumptionCalcul() {
    assertEquals(9, CalculatorClass.energyConsumptionCalcul("essence", 1),
                  "");
    assertEquals(12.9, CalculatorClass.energyConsumptionCalcul("diesel", 1));
    assertEquals(1, CalculatorClass.energyConsumptionCalcul("electric", 1));
  }

  @Test
  void annualCostCalcul() {
    double taxCost = 537.9;
    double insuranceCost = 850; //TO BE REFACTORED : value depends on an unstable formula!
    double gasCost = 1053.191463;
    double totalCost = taxCost + insuranceCost + gasCost;
    assertEquals(totalCost, CalculatorClass.annualCostCalcul(70855,
                                                                    155,
                                                                  114,
                                                                "essence",
                                                              4.7));
  }
}