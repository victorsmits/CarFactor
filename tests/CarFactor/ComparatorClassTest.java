package CarFactor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ComparatorClassTest {

  @Test
  void filter() {
    Map<String, Object> criteria = new HashMap<String, Object>();
    criteria.put("year",2019);
    criteria.put("emission",123);
    criteria.put("consumption",4.9);
    criteria.put("price",86500);
    criteria.put("fuel","Diesel");
    criteria.put("power",110);
    criteria.put("norm",6);

    List<CarClass> cars = new ArrayList<CarClass>();

//    CarClass BM = new CarClass();
  }

  @Test
  void comparator() {
  }

}