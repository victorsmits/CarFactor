package CarFactor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorClassTest {

  @Test
  void insuranceCalcul() {
    /*
    Current insurance function is not highly accurate, and just gives an approximation
      of real insurance price; a relative error of maximum 45% is allowed on the result
      (Average precision on a given set of cars with given assurance prices).
     */
    int power = 155;
    int catalogueValue = 70855;
    int expectedPrice = 54*12; //expected assurance cost
    double admittedMargin = 0.55; // (margin is 1 - 0.45)
    double effectivePrice = CalculatorClass.insuranceCalcul(catalogueValue, power);
    if (effectivePrice > expectedPrice){
      assertTrue((expectedPrice/effectivePrice) >= admittedMargin);
    }
    else{
      assertTrue((effectivePrice/expectedPrice) >= admittedMargin);
    }
  }

  @Test
  void taxeCalcul() {

  }

  @Test
  void energyConsumptionCalcul() {
  }

  @Test
  void annualConsumptionCalcul() {
  }
}