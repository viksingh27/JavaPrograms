class LeapYearCalculator {
    public static boolean isLeapYear(int year)
    {
        boolean flag=false;
        if (year >=1 && year<=9999)
        {
            if (year % 4 == 0 && year % 400 == 0) {

                flag = true;

            } else if (year % 4 == 0 && year % 100 != 0) {

                flag = true;

            }
        }
        return flag;
    }
}
