package carfactor;

public class CriterionEmission extends Criterion {

  private int emission;

  CriterionEmission(int emissionCO){
    this.emission = emissionCO;
  }

  @Override
  public boolean isValid(CarClass car){
    return car.getEmission() <= this.emission;
  }
}
