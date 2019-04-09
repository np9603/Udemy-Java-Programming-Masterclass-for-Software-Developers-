public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0)
            return -1;
        else {
            int sumOfEvenDigits = 0;
            while (number>0){
                int lastDigit = number%10;
                if(lastDigit%2==0)
                    sumOfEvenDigits += lastDigit;
                number=number/10;
            }
            return sumOfEvenDigits;
        }
    }
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(123456789));
    }
}
