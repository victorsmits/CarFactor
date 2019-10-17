package CarFactor;

public class CriterionPower extends Criterion {

  private int maxPower;
  private int minPower;

  CriterionPower(int powerMin, int powerMax){
    this.maxPower = powerMax;
    this.minPower = powerMin;
  }

  public boolean isValid(CarModelClass car){
    int power = car.getPower();
    return power >= this.minPower && power <= this.maxPower;
  }
}
