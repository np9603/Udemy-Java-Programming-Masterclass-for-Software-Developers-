public class SecondsAndMinutes {
    public static String getDurationString(int minutes,int seconds){
        if(minutes<0 || seconds<0 || seconds>59)
            return "INVALID VALUE";
        else {
            int hours = minutes/60;
            return (hours + " h " + (minutes%60) + " m " + seconds + " s");
        }
    }

    public static String getDurationString(int seconds){
        if(seconds<0)
            return "INVALID VALUE";
        else {
            int minutes = (int)seconds/60;
            int remainingseconds = (int)seconds%60;
            return getDurationString(minutes,remainingseconds);
        }

    }
    public static void main(String[] args) {
        System.out.println(getDurationString(58,59));
        System.out.println(getDurationString(3599));
    }
}
