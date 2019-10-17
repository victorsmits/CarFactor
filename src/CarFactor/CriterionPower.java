package CarFactor;

public class CriterionPower extends Criterion {

  int maxPower;
  int minPower;

  CriterionPower(int powerMax, int powerMin){
    this.maxPower = powerMax;
    this.minPower = powerMin;
  }

  public boolean isValid(CarModelClass car){
    int power = car.getPower();
    return power >= this.minPower && power <= this.maxPower;
  }
}
