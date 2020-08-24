public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5,6));
    }
    private static final double MATH = Math.PI;
    public static double area(double radius)
    {
        if (radius<0)
        {
            return -1;
        }
        double areaOfCircle = radius * radius * MATH;
        return areaOfCircle;
    }
    public static int area(int x , int y)
    {
        if ((x<0)||(y<0))
        {
            return -1;
        }
        int areaOfRectangle = (x * y);
        return areaOfRectangle;
    }

}
