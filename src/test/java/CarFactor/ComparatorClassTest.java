package CarFactor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComparatorClassTest extends ComparatorClass {

  @Test
  void filter() {

    Map<String, Object> criteria = new HashMap<String, Object>();
    criteria.put("buyYearMin", 2018);
    criteria.put("buyYearMax", 2020);
    criteria.put("consumption",4.9);
    criteria.put("emission",123);
    criteria.put("fuel","Diesel");
    criteria.put("mileageMin", 23000);
    criteria.put("mileageMax", 26000);
    criteria.put("norm",6);
    criteria.put("powerMin",1);
    criteria.put("powerMax",110);
    criteria.put("price",86500);
    criteria.put("YearMin",2017);
    criteria.put("YearMax",0);

    List<CarClass> cars = new ArrayList<CarClass>();
    List<CarClass> carsExpected = new ArrayList<CarClass>();
    List<CarClass> carsResponse;

    CarClass BM001 = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1CBF001", 24000);
    cars.add(BM001);
    carsExpected.add(BM001);

    CarClass BM002 = new CarClass("BMW", "Serie 3", 2019, 123,
            4.9, 86500, "Diesel", 110, 6, 2019,
            "1VDK111", 50624);
    cars.add(BM002);

    CarClass BM003 = new CarClass("BMW", "M3", 2018, 209,
            9.1, 86500, "Petrol", 317, 6, 2019,
            "1PWM042", 24000);
    cars.add(BM003);

    carsResponse = ComparatorClass.filter(cars, criteria);

    assertEquals(carsExpected, carsResponse);

  }

  @Test
  void comparator() {
  }

}