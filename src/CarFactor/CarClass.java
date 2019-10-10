package CarFactor;

public class CarClass extends CarModelClass {
    private CarModelClass carModel;
    private int buyYear;
    private String plateNumber;
    private int mileage;

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
