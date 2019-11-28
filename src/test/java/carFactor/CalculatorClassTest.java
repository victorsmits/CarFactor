package carfactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class CalculatorClassTest {

  @Test
  void insuranceCost() {
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
    double effectivePrice = CalculatorClass.insuranceCost(catalogueValue, power);
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
  void taxCost() {
    /* test based on values given here :
      https://www.mon-assurance-auto.be/taxes/taxe-circulation-auto-belgique.html
     */
    double[][] realValues = {{83.56,40, 70}, {104.68, 90, 90}, {244.2, 150, 100},
                          {290.93, 170, 120}, {337.13, 190, 140},
                          {437.45, 210, 140}, {1358.54, 350, 150}};
    for (int i = 0; i < realValues.length; i++){
      assertEquals(realValues[i][0], CalculatorClass.taxCost(realValues[i][1], realValues[i][2]),
                    "Inadequate tax computation formula.");
    }
  }

  @Test
  void energyConsumptionCalcul() {
    assertEquals(9, CalculatorClass.energyConsumption("essence", 1),
                  "");
    assertEquals(12.9, CalculatorClass.energyConsumption("diesel", 1));
    assertEquals(1, CalculatorClass.energyConsumption("electric", 1));
    assertEquals(2, CalculatorClass.energyConsumption("electric", 2));
  }

  @Test
  void annualCost() {
    double taxCost = 537.9;
    double insuranceCost = 850;
    double gasCost = 1053.191463;
    double totalCost = taxCost + insuranceCost + gasCost;
    double difference = totalCost - CalculatorClass.annualCost(70855,
                                                                      155,
                                                                    114,
                                                                  "essence",
                                                                  4.7);
    assertTrue(Math.abs(difference) <= 0.55*insuranceCost,
                "Total cost outside of admitted boundaries from insurance incertainty");
  }
}