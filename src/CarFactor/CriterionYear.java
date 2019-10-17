package CarFactor;

public class CriterionYear extends Criterion {

  private static int yearMin;
  private static int yearMax;

  CriterionYear(int yearMi){
    yearMin = yearMi;
    yearMax = 0;
  }

  CriterionYear(int yearMi, int yearMa){
    yearMin = yearMi;
    yearMax = yearMa;
  }

  public static boolean isValid(CarModelClass car){
    if (car.getYear() <= yearMin)
      return false;
    return yearMax != 0 && car.getYear() <= yearMax;
  }

  public void setYearMin(int year){
    yearMin = year;
  }

  public int getYearMin() {
    return yearMin;
  }

  public void setYearMax(int year) {
    yearMax = year;
  }

  public int getYearMax() {
    return yearMax;
  }
}
