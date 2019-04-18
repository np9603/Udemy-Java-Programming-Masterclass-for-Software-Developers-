import java.sql.SQLOutput;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10)
            return -1;
        else {
            int smallerOfTwo = first < second ? first : second;
            int gcd = 1;
            for (int i = 1; i < smallerOfTwo; i++) {
                if (first % i == 0 && second % i == 0)
                    gcd = i;
                else
                    continue;
            }
            return gcd;
        }

    }
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));

    }
}
