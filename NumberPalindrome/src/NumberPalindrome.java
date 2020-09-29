public class NumberPalindrome {
    public static void main(String[] args)
    {
        isPalindrome(1221);
    }
    public static boolean isPalindrome(int number)
    {
        int reverse = 0;
        int lastDigit;
        int testedNum = number;
        while (testedNum != 0)
        {
            lastDigit = testedNum % 10;
            reverse = reverse * 10;
            reverse =  reverse + lastDigit;
            testedNum = testedNum / 10;
        }
        if (reverse == number)
        {
            System.out.println("Number is palindrome");
            return true;
        }
       return false;
    }

}
