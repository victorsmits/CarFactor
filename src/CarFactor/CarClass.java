package CarFactor;

public class CarClass extends CarModelClass {
    private CarModelClass carModel;
    private int buyYear;
    private String plateNumber;
    private int mileage;

    public CarClass(String brand, String model, int year, int emission,
                    int consumption, int catalogueValue, String fuel, int power, int norm,
                    CarModelClass carModel, int buyYear, String plateNumber, int mileage) {

        super(brand, model, year, emission, consumption, catalogueValue, fuel, power, norm);
        this.carModel = carModel;
        this.buyYear = buyYear;
        this.plateNumber = plateNumber;
        this.mileage = mileage;
    }

    public int getBuyYear() {
        return buyYear;
    }

    public void setBuyYear(int buyYear) {
        this.buyYear = buyYear;
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

    public CarModelClass getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModelClass carModel) {
        this.carModel = carModel;
    }
}
