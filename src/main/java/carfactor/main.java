package carfactor;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static Map<String,CarModelClass> mapCarModel;
  //test
  public static void main(String[] args) {
    Map<String, Object> criteria = new HashMap<String, Object>();

    JSONParser parser = new JSONParser();

    try {

      Object obj = parser.parse(new FileReader(
              "Data/models.json"));

      JSONObject carModelJson = (JSONObject) obj;

      JSONArray carModelList = (JSONArray) carModelJson.get("data");

      Iterator<JSONObject> models = carModelList.iterator();

      while (models.hasNext()) {
        CarModelClass model = new CarModelClass(
                models.next().get("brand").toString(),
                models.next().get("model").toString(),
                (int) models.next().get("year"),
                (int) models.next().get("Emission"),
                (int) models.next().get("consumption"),
                (int) models.next().get("price"),
                models.next().get("fuel").toString(),
                (int) models.next().get("power"),
                (int) models.next().get("norm")
        );

        String modelname = models.next().get("brand").toString() + "-"
                + models.next().get("model").toString() + "-"
                + models.next().get("year").toString();

        mapCarModel.put(modelname,model);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Example Program");
    System.out.println("");
    System.out.println("Menu Options:");
    System.out.println("1. Add criteria");
    System.out.println("2. Add car to database");
    System.out.println("3. Some menu option");
    System.out.println("4. Some menu option");
    System.out.println("5. Exit the program");
    System.out.println("");
    System.out.print("Please select an option from 1-5\r\n");

    try {
      int input = Integer.parseInt(br.readLine());

      if(input < 0 || input > 5) {
        System.out.println("You have entered an invalid selection, please try again\r\n");
      }
      switch (input){
        case 1: criteria = addCriteria();
        //case 2: addCaToDatabase();
        case 3: filterCar(criteria);
      }
    } catch (IOException ioe) {
      System.out.println("IO error trying to read your input!\r\n");
      System.exit(1);
    }
    System.out.println(criteria);
  }

  private static List<CarClass> filterCar(Map<String, Object> criteria) {
    List<CarClass> cars = new ArrayList<CarClass>();



    return ComparatorClass.filter(cars, criteria);
  }

  private static Map<String, Object> addCriteria() throws IOException {
    Map<String, Object> criteriaList = new HashMap<String, Object>();

    System.out.println("Add minimum buy year:");
    criteriaList.put("buyYearMin", Integer.parseInt(br.readLine()));

    System.out.println("Add maximum buy year [default no maximum]:");
    if(br.readLine().equals(""))
      criteriaList.put("buyYearMax", 0);
    else
     criteriaList.put("buyYearMax", Integer.parseInt(br.readLine()));

    System.out.println("Add consumption:");
    //criteriaList.put("consumption",Integer.parseInt(br.readLine()));
    //Fix : int --> double
    criteriaList.put("consumption",Double.parseDouble(br.readLine()));

    System.out.println("Add emission:");
    criteriaList.put("emission",Integer.parseInt(br.readLine()));

    System.out.println("Add fuel type:");
    criteriaList.put("fuel",br.readLine());

    System.out.println("Add minimum mileage:");
    criteriaList.put("mileageMin", Integer.parseInt(br.readLine()));

    System.out.println("Add maximum mileage:");
    criteriaList.put("mileageMax", Integer.parseInt(br.readLine()));

    System.out.println("Add norm:");
    criteriaList.put("norm",Integer.parseInt(br.readLine()));

    System.out.println("Add minimum power:");
    criteriaList.put("powerMin",Integer.parseInt(br.readLine()));

    System.out.println("Add maximum power:");
    criteriaList.put("powerMax",Integer.parseInt(br.readLine()));

    System.out.println("Add price:");
    criteriaList.put("price",Integer.parseInt(br.readLine()));

    System.out.println("Add minimum year:");
    criteriaList.put("YearMin",Integer.parseInt(br.readLine()));
    System.out.println("Add maximum year:");
    criteriaList.put("YearMax",Integer.parseInt(br.readLine()));

    return criteriaList;
  }
  /**Fix PMD warning: Avoid unused private methods such as 'addCaToDatabase()'.
   * private static void addCaToDatabase(){
    // TODO
  }**/
}