package CarFactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class main {
  private static Map<String, Object> criteria = new HashMap<String, Object>();
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) {
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
        case 1: addCriteria();
        case 2: addCaToDatabase();
        case 3:
      }
    } catch (IOException ioe) {
      System.out.println("IO error trying to read your input!\r\n");
      System.exit(1);
    }
  }

  private static void addCriteria() throws IOException {
    Map<String, Object> criteria = new HashMap<String, Object>();
    System.out.println("Add minimum buy year:");
    criteria.put("buyYearMin", Integer.parseInt(br.readLine()));

    System.out.println("Add maximum buy year:");
    if(br.readLine() == "")
      criteria.put("buyYearMax", 0);
    else
      criteria.put("buyYearMax", Integer.parseInt(br.readLine()));

    System.out.println("Add consumption:");
    criteria.put("consumption",Integer.parseInt(br.readLine()));

    System.out.println("Add emission:");
    criteria.put("emission",Integer.parseInt(br.readLine()));

    System.out.println("Add fuel type:");
    criteria.put("fuel",br.readLine());

    System.out.println("Add minimum mileage:");
    criteria.put("mileageMin", Integer.parseInt(br.readLine()));

    System.out.println("Add maximum mileage:");
    criteria.put("mileageMax", Integer.parseInt(br.readLine()));

    System.out.println("Add norm:");
    criteria.put("norm",Integer.parseInt(br.readLine()));

    System.out.println("Add minimum power:");
    criteria.put("powerMin",Integer.parseInt(br.readLine()));

    System.out.println("Add maximum power:");
    criteria.put("powerMax",Integer.parseInt(br.readLine()));

    System.out.println("Add price:");
    criteria.put("price",Integer.parseInt(br.readLine()));

    System.out.println("Add minimum year:");
    criteria.put("YearMin",Integer.parseInt(br.readLine()));

    System.out.println("Add maximum year:");
    criteria.put("YearMax",Integer.parseInt(br.readLine()));
  }

  private static void addCaToDatabase(){

  }
}
