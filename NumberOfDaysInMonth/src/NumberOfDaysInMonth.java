public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        isLeapYear(2600);
        getDaysInMonth(130, -9);

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0);
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year)
    {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999))
        {
            System.out.println("Invalid");
            return -1;
        }
        else
            {
                boolean leapYearCheck = isLeapYear(year);
                if (leapYearCheck)
                {
                    switch (month)
                    {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            return 31;
                        case 2:
                            return 29;
                        default:
                            return 30;
                    }
                }
                else
                {
                    switch (month)
                        {
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                                return 31;
                            case 2:
                                return 28;
                            default:
                                return 30;
                        }
                }
            }
    }

}
