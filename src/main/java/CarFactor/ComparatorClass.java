package CarFactor;

import java.util.*;

public class ComparatorClass {
  private List<CarClass> carsList;
  private Map<String, Object> criteria = new HashMap<String, Object>();


  public List<CarClass> filter(List<CarClass> cars, Map criteria){
    CriterionBuyYear buyYear = new CriterionBuyYear((int)criteria.get("buyYearMin"),(int)criteria.get("buyYearMax"));
    CriterionConsumption consumption = new CriterionConsumption((double)criteria.get("consumption"));
    CriterionEmission emission = new CriterionEmission((int)criteria.get("emission"));
    CriterionMileage mileage = new CriterionMileage((int)criteria.get("mileageMin"), (int)criteria.get("mileageMax"));
    CriterionNorm norm = new CriterionNorm((int)criteria.get("norm"));
    CriterionPower power = new CriterionPower((int)criteria.get("powerMin"), (int)criteria.get("powerMax"));
    CriterionPrice price = new CriterionPrice((int)criteria.get("price"));
    CriterionYear year = new CriterionYear((int)criteria.get("YearMin"), (int)criteria.get("YearMax"));
    CriterionFuel fuel = new CriterionFuel((String)criteria.get("fuel"));

    for (CarClass car: cars) {
      if (TestCriteria(buyYear, consumption, emission, mileage, norm, power, price, year, fuel, car))
        this.carsList.add(car);
    }
        return this.carsList;
    }

  private static boolean TestCriteria(CriterionBuyYear buyYear, CriterionConsumption consumption,
                                      CriterionEmission emission, CriterionMileage mileage,
                                      CriterionNorm norm, CriterionPower power,
                                      CriterionPrice price, CriterionYear year,
                                      CriterionFuel fuel, CarClass car) {
    return (buyYear.isValid(car) && consumption.isValid(car) && emission.isValid(car) &&
            mileage.isValid(car) && norm.isValid(car) && power.isValid(car) &&
            price.isValid(car) && fuel.isValid(car) && year.isValid(car));
  }

  private List<String> cutString(String chain){
        List<String> listCriteria = new ArrayList<String>();
        return listCriteria;
    }

    public List<CarClass> comparator(String chain){
        List<CarClass> carList = new ArrayList<CarClass>();

        List<String> listCriteria = cutString(chain);

        return carList;
    }

    public Map<String, Object> getCriteria() {
        return criteria;
    }

    public void setCriteria(int year, int emission,int consumption, int price,
                            String fuel, int power, int norm) {
        this.criteria.put("year",year);
        this.criteria.put("emission",emission);
        this.criteria.put("consumption",consumption);
        this.criteria.put("price",price);
        this.criteria.put("fuel",fuel);
        this.criteria.put("power",power);
        this.criteria.put("norm",norm);
    }
}
