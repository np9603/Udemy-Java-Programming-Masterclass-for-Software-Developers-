public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number<0)
            return -1;

        else {
            int largestPrime=-1;
            for(int i = 2; i<number;i++){
                if(number%i==0 && i>largestPrime){
                    largestPrime=i;
                }
            }
            return largestPrime;
        }
    }
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));

    }
}
