package carFactor;

public class CriterionBuyYear extends Criterion {

  private int minYear;
  private int maxYear;

  CriterionBuyYear(int yearMin, int yearMax){
    this.minYear = yearMin;
    this.maxYear = yearMax;
  }

  @Override
  public boolean isValid(CarClass car){
    int year = car.getYear();
    return year >= this.minYear && year <= this.maxYear;
  }
}
