public class GetLargestPrime {

    public static int getLargestPrime(int number){
        if(number <=0){
            return -1;
        }
        int largestPrime = 2;
        while(number > largestPrime){
            if(number % largestPrime == 0){
                number /= largestPrime;
                largestPrime = 2;
            }
            else{
                largestPrime ++;
            }
        }
        return largestPrime;
    }

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(64));

    }
}
