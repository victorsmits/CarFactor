package CarFactor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ComparatorClassTest {

  @Test
  void filter() {

    Map<String, Object> criteria = new HashMap<String, Object>();
    criteria.put("buyYearMin", 2019);
    criteria.put("buyYearMan", 2020);
    criteria.put("consumption",4.9);
    criteria.put("emission",123);
    criteria.put("fuel","Diesel");
    criteria.put("mileage", 25000);
    criteria.put("norm",6);
    criteria.put("powerMin",110);
    criteria.put("powerMax",1);
    criteria.put("price",86500);
    criteria.put("yearMin",2017);
    criteria.put("yearMax",2019);

    List<CarClass> cars = new ArrayList<CarClass>();
    List<CarClass> carsExpected = new ArrayList<CarClass>();
    List<CarClass> carsResponse = new ArrayList<CarClass>();

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

    assertEquals(cars, carsResponse);

  }

  @Test
  void comparator() {
  }

}