public class SpeedConverter{
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0)
            return -1;
        else {
            long MilesPerHour = Math.round(kilometersPerHour/1.609);
            return MilesPerHour;
        }

    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else {
            long result = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    }
    public static void main(String[] args) {
        SpeedConverter sc = new SpeedConverter();
        System.out.println(sc.toMilesPerHour(1.5));
        System.out.println(sc.toMilesPerHour(10.25));
        System.out.println(sc.toMilesPerHour(-5.6));
        System.out.println(sc.toMilesPerHour(25.42));
        System.out.println(sc.toMilesPerHour(75.114));
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}