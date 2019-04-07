public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if(temperature>24 && temperature<46){
                return true;
            }
            return false;
        }
        if(temperature>24 && temperature<36){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }
}
