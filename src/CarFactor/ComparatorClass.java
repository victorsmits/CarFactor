package CarFactor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparatorClass {
    private List<CarClass> cars;
    private Map<String, Object> criteria = new HashMap<String, Object>();


  public static List<CarClass> filter(List<CarClass> cars, Map criteria){
        List<CarClass> carList = cars;

        return carList;
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
