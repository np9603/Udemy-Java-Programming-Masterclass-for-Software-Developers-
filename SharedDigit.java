public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1<10 || num1>99 || num2<0 || num2>99)
            return false;
        else {
            int lastDigitNum1= num1%10;
            int lastDigitNum2= num2%10;

            int firstDigitNum1 = num1/10;
            int firstDigitNum2 = num2/10;

            if(firstDigitNum1==lastDigitNum1||firstDigitNum1==lastDigitNum2||firstDigitNum2==lastDigitNum1||firstDigitNum2==lastDigitNum2)
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));

    }
}
