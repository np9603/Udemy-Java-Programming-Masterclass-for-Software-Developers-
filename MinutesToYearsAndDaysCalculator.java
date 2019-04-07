public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0)
            System.out.println("Invalid Value");
        else{
            int days = (int)((minutes/60)/24)%365;
            int years = (int)(((minutes/60)/24)/365);
            System.out.println(minutes + " minutes = "  + years + " y and " + days + " d");
        }
    }
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
