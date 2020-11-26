public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int totalWeight = (bigCount*5) + (smallCount*1);
        if(totalWeight < goal){
            return false;
        }
        else if(totalWeight == goal){
            return true;
        }
        else{
            while(bigCount>0){
                goal -= 5;
                if(goal == 0)
                    return true;

                else if(goal < 0)
                    return false;
                bigCount--;
            }
            while (smallCount>0){
                goal -= 1;
                if(goal == 0)
                    return true;
                else if(goal < 0)
                    return false;
                smallCount--;
            }
            return false;
            }
        }

    public static boolean canPackOptimized(int bigCount, int smallCount, int goal){
        if(bigCount >= 0 && smallCount >= 0 && (bigCount*5 + smallCount >= goal)){
            return smallCount>=goal%5;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPackOptimized(1,0,4));
        System.out.println(canPackOptimized(1,0,5));
        System.out.println(canPackOptimized(0,5,4));
        System.out.println(canPackOptimized(2,2,11));
        System.out.println(canPackOptimized(-3,2,12));
    }
}