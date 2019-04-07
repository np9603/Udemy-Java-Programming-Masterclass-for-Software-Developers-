public class TeenNumberChecker {
    public static boolean hasTeen(int num1,int num2,int num3){
        if(num1>12 && num1<20 || num2>12 && num2<20 || num3>12 && num3<20)
            return true;
        else
            return false;
    }

    public static boolean isTeen(int num1){
        if(num1>12 && num1<20)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
}
