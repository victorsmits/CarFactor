package carFactor;

public class CriterionFuel extends Criterion {

  private String fuel;

  CriterionFuel(String fuelStr){
    this.fuel = fuelStr;
  }

  @Override
  public boolean isValid(CarClass car){
    return fuel == car.getFuel();
  }
}
