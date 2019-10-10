package CarFactor;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class ComparatorClass {
    private List<CarClass> cars;
    private Dictionary<String, Integer> criteria;

    public ComparatorClass(List<CarClass> cars) {}

    public List<CarClass> filter(Dictionary criteria){
        List<CarClass> carList = new ArrayList<CarClass>();

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

    public Dictionary<String, Integer> getCriteria() {
        return criteria;
    }

    public void setCriteria(int year, int emission,int consumption, int price,
                            String fuel, int power, int norm) {

        this.criteria.put("year",year);
       this.criteria.put("emission",emission);
       this.criteria.put("consumption",consumption);
       this.criteria.put("price",price);
       this.criteria.put("power",power);
       this.criteria.put("norm",norm);
    }
}
