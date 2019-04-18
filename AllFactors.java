public class AllFactors {
    public static void printFactors(int number){
        if(number<1)
            System.out.println("\nInvalid Value");
        else {
            System.out.print("\nThe factors of " + number + " are: ");
            for (int i = 1; i <= number; i++) {
                if(number%i==0)
                    System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
