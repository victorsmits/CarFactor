package carfactor;

import java.util.*;

public class ComparatorClass {

  public static List<CarClass> filter(List<CarClass> cars, Map criteria){

    CriterionBuyYear buyYear = new CriterionBuyYear((int)criteria.get("buyYearMin"),
            (int)criteria.get("buyYearMax"));

    CriterionConsumption consumption = new CriterionConsumption((double)criteria.get("consumption"));

    CriterionEmission emission = new CriterionEmission((int)criteria.get("emission"));

    CriterionMileage mileage = new CriterionMileage((int)criteria.get("mileageMin"),
            (int)criteria.get("mileageMax"));

    CriterionNorm norm = new CriterionNorm((int)criteria.get("norm"));

    CriterionPower power = new CriterionPower((int)criteria.get("powerMin"),
            (int)criteria.get("powerMax"));

    CriterionPrice price = new CriterionPrice((int)criteria.get("price"));

    CriterionYear year = new CriterionYear((int)criteria.get("YearMin"),
            (int)criteria.get("YearMax"));

    CriterionFuel fuel = new CriterionFuel((String)criteria.get("fuel"));

    List<CarClass> carsList = new ArrayList<CarClass>();

    for (CarClass car: cars) {
      if (TestCriteria(buyYear, consumption, emission, mileage,
              norm, power, price, year, fuel, car)) {
        carsList.add(car);
      }
    }
      return carsList;
  }

  private static boolean TestCriteria(CriterionBuyYear buyYear, CriterionConsumption consumption,
                                      CriterionEmission emission, CriterionMileage mileage,
                                      CriterionNorm norm, CriterionPower power,
                                      CriterionPrice price, CriterionYear year,
                                      CriterionFuel fuel, CarClass car) {
    /** Fix PMD : Useless parentheses.
     * return (buyYear.isValid(car) && consumption.isValid(car) && emission.isValid(car) &&
     *             mileage.isValid(car) && norm.isValid(car) && power.isValid(car) &&
     *             price.isValid(car) && fuel.isValid(car) && year.isValid(car));
     *
     */

    return buyYear.isValid(car) && consumption.isValid(car) && emission.isValid(car) &&
            mileage.isValid(car) && norm.isValid(car) && power.isValid(car) &&
            price.isValid(car) && fuel.isValid(car) && year.isValid(car);
  }

  //Fix PMD : Avoid unused method parameters such as 'chain'.
   //private List<String> cutString(String chain){
   //Fix PMD : Avoid unused private methods such as 'cutString()'.
   //private List<String> cutString (){
   //List<String> listCriteria = new ArrayList<String>();
   // return listCriteria;}
   //
    public List<CarClass> comparator(String chain){
        List<CarClass> carList = new ArrayList<CarClass>();

      /** Fix PMD : Avoid unused local variables such as 'listCriteria'.
       *         List<String> listCriteria = cutString(chain);
       */

        return carList;
    }

    public void setCriteria(int year, int emission,int consumption, int price,
                            String fuel, int power, int norm) {
       Map<String, Object> criteria = new HashMap<String, Object>();

      criteria.put("year",year);
      criteria.put("emission",emission);
      criteria.put("consumption",consumption);
      criteria.put("price",price);
      criteria.put("fuel",fuel);
      criteria.put("power",power);
      criteria.put("norm",norm);
    }
}
