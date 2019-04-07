public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        int num1 = (int)(number1 * 1000);
        int num2 = (int)(number2 * 1000);
        if(num1 == num2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
