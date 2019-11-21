package CarFactor;

public class CriterionYear extends Criterion {

  private int yearMin;
  private int yearMax;


  CriterionYear(int yearMi, int yearMa){
    this.yearMin = yearMi;
    this.yearMax = yearMa;
  }

  @Override
  public boolean isValid(CarClass car){
    int year = car.getYear();
    if(this.yearMin>this.yearMax && this.yearMax !=0){
      return false;
    }
    if (this.yearMax == 0)
      return year >= this.yearMin;
    else
      return year >= this.yearMin && year <= this.yearMax;
  }

}
