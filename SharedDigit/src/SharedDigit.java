public class SharedDigit {
    public static void main ( String[] args)
    {
        System.out.println("It is " + hasSharedDigit(5,26));
    }

    public static boolean hasSharedDigit(int a , int b)
    {
        int par1_mod = a % 10;
        int par2_mod = b % 10;
        int par1_res = a / 10;
        int par2_res = b / 10;
        if ((a < 10 || b < 10) || ( a > 99 ||b > 99))
        {
            return false;
        }
       else if (par1_mod == par2_mod || par1_mod == par2_res || par1_res == par2_mod || par1_res == par2_res)
        {
            return true;
        }
        return false;
    }
}
