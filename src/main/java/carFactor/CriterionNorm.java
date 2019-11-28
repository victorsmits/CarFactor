package carFactor;

public class CriterionNorm extends Criterion {

  private int norm;

  CriterionNorm(int euroNorm){
    this.norm = euroNorm;
  }

  @Override
  public boolean isValid(CarClass car){
    return car.getNorm() <= this.norm;
  }
}
