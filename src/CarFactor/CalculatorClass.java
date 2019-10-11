package CarFactor;

public class CalculatorClass {
    public CalculatorClass() {
    }

    public static double insuranceCalcul(int catalogValue, int power){
        /**
         * Computes the annual price of a car insurance given its catalog value and power.
         * The formula used is approximated from a given set of cars with real insurance prices.
         * This formula is not highly accurate and can be improved.
         */
        double insurancePrice = 12*((power*catalogValue/110000)+2);
        //Cut off erratic values ; formula is (kind of) valid within a certain range of prices
        if (insurancePrice < 240){
            insurancePrice = 240;
        }
        else if (insurancePrice > 720){
            insurancePrice = 720;
        }
        return insurancePrice;
    }

    public int taxeCalcul(){
        int taxePrice = 0;
        return taxePrice;
    }

    public int energyConsumptionCalcul(){
        int energyConsumption = 0;
        return energyConsumption;
    }

    public int annualConsumptionCalcul(){
        int annualConsumption = 0;
        return annualConsumption;
    }
}
