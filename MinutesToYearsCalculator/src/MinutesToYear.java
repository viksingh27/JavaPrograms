public class MinutesToYear {
    public static void main(String[] args) {
        printYearsAndDays(-1051200);
    }
    public static void printYearsAndDays(long minutes)
    {
        if (minutes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int minutesToYear = (int) (minutes  / 60) /24;
            int calculatedYears = minutesToYear /365;
            int remainingDays = minutesToYear % 365;
            System.out.println(minutes + " min = " + calculatedYears + " y " + remainingDays + " d");
        }

    }
}
