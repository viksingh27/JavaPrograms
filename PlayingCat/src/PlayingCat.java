public class PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(false,46);
        System.out.println();

    }
    public static boolean isCatPlaying(boolean summer , int temperature)
    {
        if ((summer == true) && (temperature >=25 && temperature <=45))
        {
            System.out.println("false since temperature is not in range 25-45");
            return true;
        }
        else if ((summer != true) && (temperature >= 25 && temperature <=35))
        {
            System.out.println("false since temperature is not in range 25-35");
            return true;
        }
        else
        {
            System.out.println("true since temperature is in range 25-35");
            return false;
        }
    }
}
