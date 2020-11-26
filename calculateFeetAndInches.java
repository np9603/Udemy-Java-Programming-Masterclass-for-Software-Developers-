public class CalculateFeetAndInches {
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet<0 || inches<0 || inches>12)
            return -1;
        else {
            return (feet*12 + inches)*2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0)
            return -1;
        else {
//            double feet = (int)(inches/12);
//            inches = inches%12;
            return calcFeetAndInchesToCentimeters((int)(inches/12),(int)(inches%12));
        }
    }
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(8,4));
        System.out.println(calcFeetAndInchesToCentimeters(-10));
    }
}
