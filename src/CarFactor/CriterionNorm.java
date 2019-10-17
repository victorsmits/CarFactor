package CarFactor;

public class CriterionNorm extends Criterion {

  private int norm;

  CriterionNorm(int euroNorm){
    this.norm = euroNorm;
  }

  @Override
  public boolean isValid(CarModelClass car){
    return car.getNorm() <= norm;
  }
}
