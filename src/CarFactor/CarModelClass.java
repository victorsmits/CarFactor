package CarFactor;

public class CarModelClass {
    private String brand;
    private String model;
    private int year;
    private int emission;
    private int consumption;
    private int catalogueValue;
    private String fuel;
    private int power;
    private int norm;

    public CarModelClass(String brand, String model, int year, int emission,
                         int consumption, int catalogueValue, String fuel, int power, int norm) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.emission = emission;
        this.consumption = consumption;
        this.catalogueValue = catalogueValue;
        this.fuel = fuel;
        this.power = power;
        this.norm = norm;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEmission() {
        return emission;
    }

    public void setEmission(int emission) {
        this.emission = emission;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNorm() {
        return norm;
    }

    public void setNorm(int norm) {
        this.norm = norm;
    }

    public int getCatalogueValue() {
        return catalogueValue;
    }

    public void setCatalogueValue(int catalogueValue) {
        this.catalogueValue = catalogueValue;
    }
}
