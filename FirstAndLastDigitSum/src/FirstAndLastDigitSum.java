public class FirstAndLastDigitSum {
    public static void main (String[] args)
    {
        System.out.println("Sum of first and last digit number is " + sumFirstAndLastDigit(125));
    }
    public static int sumFirstAndLastDigit(int number)
    {
        int firstDigit = number % 10;
        int num = number / 10;
        int lastDigit = firstDigit;
        if (number < 0 )
        {
            return -1;
        }
        while (num >= 1)
        {
            lastDigit = num % 10;
            num /= 10;
        }
        return firstDigit + lastDigit ;
    }
}
