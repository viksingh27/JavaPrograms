public class EvenDigitSum {
    public static void main(String [] args)
    {
        System.out.println("Sum of even digit is " + getEvenDigitSum(1241548));
    }

    public static int getEvenDigitSum(int number)
    {
        int num = 0;
        int sum = 0;
        if (number < 0)
        {
            return -1;
        }

        while (number != 0)
            {
                num = number % 10;
                number = number / 10;
                if (num % 2 == 0)
                {
                    sum += num;
                }
            }

        return sum;
    }
}
