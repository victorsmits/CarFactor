package CarFactor;

public class CriterionConsumption extends Criterion {

  private double conso;

  CriterionConsumption(double consumption){
    this.conso = consumption;
  }

  CriterionConsumption(int consumption){
    this.conso = consumption;
  }

  @Override
  public boolean isValid(CarClass car){
    return car.getConsumption() <= this.conso;
  }
}
