public class Hello {
        public static void main(String[] args)
        {
            System.out.println("My Name is Vikrant Singh Chauhan");
            checkNumber(0);
        }
        public static void checkNumber(int number)
        {
            if (number>0)
            {
                System.out.println("Positive");
            }
            else if(number<0)
            {
                System.out.println("Negetive");
            }
            else
            {
                System.out.println("Number is equal");
            }
        }
}
