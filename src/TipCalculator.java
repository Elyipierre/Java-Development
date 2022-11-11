public class TipCalculator {
    //Step 1 - Calculate Tip: tip = tipRate * listedMealPrice;
    //Step 2 - Calculate Tax: tax = taxRate * listedMealPrice;
    //Step 3 - Calculate Result: result = tip + tax + listedMealPrice;
    //Step 4 - Output Result: System.out.println(result);
    //How can we account for different tipRates, taxRates, and listedMealPrices?

    public static double calculatedMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        //Add a call to calculate total meal price
        double groupTotalMealPrice = calculatedMealPrice(100, .2,.08);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);
    }
}
