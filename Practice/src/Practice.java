public class Practice {

    public static void main(String[] args) {
        System.out.println();
        // 1) 9's Table
        System.out.println();
                    for (int i = 0; i <= 10; i++)
                    {
                        int y = 9;
                        int z = y * i;
                        System.out.println(y + " * " + i + " = " + z );
                    }
        System.out.println();
        // 2) Creating even values from array
        System.out.println();
                    int [] a = new int[]{1,2,3,4,5,6,7,8,9,10};

                    for (int i  = 0; i < a.length; i++)
                    {
                        if(a[i] % 2 ==0)
                        {
                            System.out.println("Even Number is : " + a[i]);
                        }
                    }
        System.out.println();
        // 3) Creating odd values from 2d array
        System.out.println();

                    int[][] x= new int[3][5];
                    int counter = 1;

                    for(int i = 0; i < x.length; i++)
                    {

                        for (int j = 0; j < x.length; j++)
                        {
                            x[i][j] = counter;
                            counter++;
                            if(x[i][j] % 2 == 1)
                            {
                                System.out.print(x[i][j] + " ");
                            }


                        }
                        System.out.println();
                    }
        System.out.println();
        // 4) print integers till 20
        System.out.println();

                    int[] arr = new int[20];

                    int arrayInteger = 1;
                    for (int i = 0; i <arr.length; i++)
                    {
                        arr[i] = arrayInteger;
                        arrayInteger++;
                        System.out.print(arr[i] + " ");
                    }
                     System.out.println();
        // 5) Adding two matrices
        System.out.println();
                    int[][] arr1 = {{1,2},{4,3}};
                    int[][] arr2 =  {{4,3},{1,2}};
                    int[][] arr3 = new int[3][3];
                    for (int i = 0; i<arr1.length;i++)
                    {
                        for (int j = 0; j<arr1.length;j++)
                        {

                            arr3[i][j] = arr1[i][j] + arr2[i][j];
                            System.out.print(arr1[i][j] + "   ");
                            System.out.println(arr2[i][j] + "   ");
                            System.out.println(" Answer is  : " +arr3[i][j] + "  ");
                        }
                        System.out.println();
                    }

    }




}
