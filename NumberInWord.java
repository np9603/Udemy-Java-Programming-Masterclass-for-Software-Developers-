public class NumberInWord {
    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
                break;
        }
    }
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(3);
        printNumberInWord(2);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(9);
        printNumberInWord(-2);
        printNumberInWord(10);


    }
}
