package carFactor;

public class CriterionMileage extends Criterion {

  private int minMileage;
  private int maxMileage;

  CriterionMileage(int mileageMin, int mileageMax ){
    this.minMileage = mileageMin;
    this.maxMileage = mileageMax;
  }

  @Override
  public boolean isValid(CarClass car){
    int mileage = car.getMileage();
    return mileage >= this.minMileage && mileage <= this.maxMileage;
  }
}
