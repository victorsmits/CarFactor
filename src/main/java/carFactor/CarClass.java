package carFactor;

public class CarClass extends CarModelClass{
  private int buyYear;
  private String plateNumber;
  private int mileage;

  public CarClass(String brand, String model, int year, int emission,
                  double consumption, int catalogueValue, String fuel,
                  int power, int norm, int buyYear, String plateNumber, int mileage) {

    super(brand, model, year, emission, consumption, catalogueValue, fuel, power, norm);
    this.buyYear = buyYear;
    this.plateNumber = plateNumber;
    this.mileage = mileage;
  }

  public int getBuyYear() {
    return buyYear;
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public int getMileage() {
    return mileage;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage;
  }
}
