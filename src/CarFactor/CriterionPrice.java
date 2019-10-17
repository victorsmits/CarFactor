package CarFactor;

public class CriterionPrice extends Criterion {

  private static int price;

  CriterionPrice(int value){
    price = value;
  }

  @Override
  public boolean isValid(CarModelClass car){
    return car.getCatalogueValue() < price;
  }

  public static int getPrice() {
    return price;
  }

  public static void setPrice(int price) {
    CriterionPrice.price = price;
  }
}
