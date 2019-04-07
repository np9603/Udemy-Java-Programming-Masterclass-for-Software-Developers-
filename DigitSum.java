public class DigitSum {
    public static int sumDigits(int number){
        if(number<10)
            return -1;
        else {
            int sumofdigits = 0;
            while (number != 0) {
                int lsd = 0;
                lsd = number % 10;
                sumofdigits += lsd;
                number = number / 10;
            }
            return sumofdigits;
        }
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }
}
