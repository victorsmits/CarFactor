package CarFactor;

public class CriterionYear extends Criterion {

  private int yearMin;
  private int yearMax;

  CriterionYear(int yearMi){
    this.yearMin = yearMi;
    this.yearMax = 0;
  }

  CriterionYear(int yearMi, int yearMa){
    this.yearMin = yearMi;
    this.yearMax = yearMa;
  }

  @Override
  public boolean isValid(CarClass car){
    int year = car.getYear();
    if (year < this.yearMin)
      return false;
    if (this.yearMax == 0)
      return true;
    return year <= this.yearMax;
  }

}
