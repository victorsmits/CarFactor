package CarFactor;

public class CalculatorClass {
    public CalculatorClass() {
    }

    public static double insuranceCalcul(int catalogValue, int power){
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

    public static double taxCalcul(double power, double emission){
        /**
         * Circulation tax in Belgium per year
         * PF [CV] = (CO2 : 45) [g/km] + (P : 40)1,6 [kW]
         */
        int taxePrice = 0;
        return taxePrice;
    }

    public static double energyConsumptionCalcul(String fuel, double consumption){
        /**
         * Returns an energetic consumption of a car for a given fuel, over 100km.
         * Fuel is a either "essence", "diesel" or "electric".
         * Consumption must be a positive number.
         */
        double energyConsumption = 0;
        return energyConsumption;
    }

    public static int annualCostCalcul(int catalogValue, int power, double emission, String fuel, double consumption){
        /**
         * Returns the annual cost of the car for an average citizen.
         * All arguments must be positive ; fuel is either "essence", "diesel" or "electric".
         * Average mileage per year in Belgium is 15151km (data from 2015)
         * Price for : - essence is 1.479 €/L
         *             - diesel is xx
         *             - electricity is xx /kWh
         */
        int annualConsumption = 0;
        return annualConsumption;
    }
}
