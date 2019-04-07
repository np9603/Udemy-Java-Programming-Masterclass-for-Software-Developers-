public class threePrimes {
    public static boolean isPrime(int number){
        if(number==1)
            return false;
        else {
//            for(int i = 2; i<= (long) Math.sqrt(number); i++)  Optimization
            for(int i = 2; i<=number/2; i++){
                if(number%i==0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int countOfPrimes = 1;
        for(int num=3;num<100;num++){
            if(countOfPrimes >10)
                break;
            if(isPrime(num)) {
                System.out.println(num);
                countOfPrimes++;
            }
        }
    }
}
