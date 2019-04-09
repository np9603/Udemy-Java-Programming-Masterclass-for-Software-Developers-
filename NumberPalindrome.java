public class NumberPalindrome {
    public static boolean isPalindrome(int number){
    int reverse = 0;
    int num = number;
    if(number<0){
        number = Math.abs(number);
    }

    while (number>0) {
        int lastDigit = number % 10;
        reverse *= 10;
        reverse += lastDigit;
        number /= 10;

    }

    if(num<0){
        if(num==(reverse*(-1)))
            return true;
        else
            return false;
    }
    else {
        if(num==reverse)
            return true;
        else
            return false;
    }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(1234321));

    }
}
