import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
            int[] A = {1,2,3,4,5};
            constructTriangle(A);
    }

//    static void print(int n)
//    {
//        if(n < 5)
//        {
//            System.out.println(n);
//
//        }
//        else if(n>=5) {
//            return;
//        }
//        print(n+1);
//    }

        public static void constructTriangle(int[] A)
        {
            //base condition
            if(A.length < 1)

                return;

            //creating new arr
            int[] temp = new int[A.length-1];
            for (int i = 0; i < A.length-1;i++)
            {
                int x = A[i]+A[i+1];
                temp[i] = x;
            }

            constructTriangle(temp);

            System.out.println(Arrays.toString(A));


        }


}
