public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0)
            System.out.println("Invalid Value");
        else {

            while(number>0) {
                int lastdigit=number%10;
                switch (lastdigit) {
                    case 0:
                        System.out.print(" zero ");
                        break;
                    case 1:
                        System.out.print(" one ");
                        break;
                    case 2:
                        System.out.print(" two ");
                        break;
                    case 3:
                        System.out.print(" three ");
                        break;
                    case 4:
                        System.out.print(" four ");
                        break;
                    case 5:
                        System.out.print(" five ");
                        break;
                    case 6:
                        System.out.print(" six ");
                        break;
                    case 7:
                        System.out.print(" seven ");
                        break;
                    case 8:
                        System.out.print(" eight ");
                        break;
                    case 9:
                        System.out.print(" nine ");
                        break;
                    default:
                        System.out.print("Invalid number");
                        break;
                }
                number=number/10;
            }
        }
    }

    public static int reverse(int number){
        int reversedNumber = 0;
        if(number<0){
            number=number*-1;
            while(number>0) {
                reversedNumber *= 10;
                reversedNumber = reversedNumber + number%10 ;
                number = number / 10;
            }
            return reversedNumber*-1;
        }
        else {
            while(number>0) {
                reversedNumber *= 10;
                reversedNumber = reversedNumber + number%10 ;
                number = number / 10;
            }
            return reversedNumber*-1;
        }
    }

    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        else if(number==0)
            return 1;
        else {
            int count = 0;
            while (number!=0){
                ++count;
                number = number/10;
            }
            return count;
        }

    }
    public static void main(String[] args) {
        numberToWords(234);
        System.out.println(getDigitCount(1));
    }
}
