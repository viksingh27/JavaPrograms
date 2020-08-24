public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(235,48));
        System.out.println(getDurationString(6500L));
    }
    public static String getDurationString(long minutes , long seconds)
    {
        if ((minutes < 0)||(seconds<=0) || (seconds >59))
        {
            return "Invalid Value";
        }
        long Hour = minutes/60L;
        long remainingMinutes = minutes % 60L;
        return Hour + " h "+ remainingMinutes + " M " + seconds + "S";
    }
    public static String getDurationString (long seconds)
    {
        if((seconds <0 ))
        {
            return "Invalid Value";
        }
        long minutes = seconds/60L;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }

}
