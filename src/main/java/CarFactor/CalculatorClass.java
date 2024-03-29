package CarFactor;

public class CalculatorClass {
    private static double essencePrice = 1.479; // €/L
    private static double dieselPrice = 1.55;
    private static double electricityPrice = 0.1524; // €/kWh
    private static int averageMileage = 15151; //data from 2015

    public CalculatorClass() {}

    public static double insuranceCost(int catalogValue, int power){
        /**
         * Returns the annual price of a car insurance given its catalog value and power.
         * The formula used is approximated from a given set of cars with real insurance prices.
         * This formula is not highly accurate and can be improved.
         * Arguments must be positive integers, otherwise an IllegalArgumentException will be
         *  thrown.
         */
        if (catalogValue < 0 || power < 0){
            throw new IllegalArgumentException();
        }
        double insurancePrice = 12*((power*catalogValue/110000)+2);
        //Cut off erratic values ; formula is (kind of) valid within a certain range of prices
        if (insurancePrice < 240){
            insurancePrice = 240;
        }
        else if (insurancePrice > 850){
            insurancePrice = 850;
        }
        return insurancePrice;
    }

    public static double taxCost(double power, double emission){
        /**
         * Circulation tax in Belgium per year
         * PF [CV] = (CO2 : 45) [g/km] + (P : 40)1,6 [kW]
         */
        if (emission < 0 || power < 0){
            throw new IllegalArgumentException();
        }
        double taxPrice = 0;
        double[] prices = {104.68,
                            151.14,
                            197.47,
                            244.20,
                            290.93,
                            337.13,
                            437.45,
                            537.90,
                            637.96,
                            738.41,
                            838.73,
                            1098.50,
                            1358.54,
                            1618.58,
                            1877.96,
                            2138.00};
        double fiscalPower = (emission/45) + (power/40)*1.6;
        int FP = (int)(fiscalPower - (fiscalPower % 1)); //integer division => rounded to the inferior
        if (FP <= 4){
            taxPrice = 83.56;
        }
        else if (FP > 20){
            throw new IllegalArgumentException("Arguments are too big; FP cannot be computed");
        }
        else {
             //https://www.mon-assurance-auto.be/taxes/taxe-circulation-auto-belgique.html
            for (int i = 5; i <=20 ; i++){
                if (FP == i){
                    taxPrice = prices[i-5];
                }
            }
        }
        return taxPrice;
    }

    public static double energyConsumption(String fuel, double consumption) {
        /**
         * Returns an energetic consumption of a car for a given fuel, over 100km.
         * Fuel is a either "essence", "diesel" or "electric".
         * Consumption must be a positive number.
         */
        if (consumption < 0) {
            throw new IllegalArgumentException("Consumption cannot be negative");
        }
        double energyConsumption = 0;
        if (fuel == "essence") {
            energyConsumption = consumption * 9;
        } else if (fuel == "diesel") {
            energyConsumption = consumption * 12.9;
        } else if (fuel == "electric") {
            energyConsumption = consumption;
        } else {
            throw new IllegalArgumentException(String.format("Fuel type \'%s\' does not exist",
                    fuel));
        }
        return energyConsumption;
    }

    public static double annualCost(int catalogValue, int power, double emission, String fuel, double consumption){
        /**
         * Returns the annual cost of the car for an average citizen.
         * All arguments must be positive ; fuel is either "essence", "diesel" or "electric"
         */
        double taxCost = taxCost(power, emission);
        double insuranceCost = insuranceCost(catalogValue, power);
        double fuelConsumption = consumption * (averageMileage/100); //liter per year
        double fuelCost = 0;
        if (fuel == "essence"){
            fuelCost = fuelConsumption * essencePrice;
        }
        else if (fuel == "diesel"){
            fuelCost = fuelConsumption * dieselPrice;
        }
        else if (fuel == "electric"){
            fuelCost = fuelConsumption * electricityPrice;
        }
        else{
            throw new IllegalArgumentException(String.format("Fuel type \'%s\' does not exist",
                    fuel));
        }
        return taxCost + insuranceCost + fuelCost;
    }
}
