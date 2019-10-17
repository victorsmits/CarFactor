package CarFactor;

public class CriterionPrice extends Criterion {

  private int price;

  CriterionPrice(int value) {
    price = value;
  }

  @Override
  public boolean isValid(CarModelClass car) {
    return car.getCatalogueValue() <= this.price;
  }

  public int getPrice() {
    return this.price;
  }
}

