public class FeetAndInchConvertor {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeter(7,5);
        calcFeetAndInchesToCentimeter(100);
    }
    public static double calcFeetAndInchesToCentimeter(double feet , double inches)
    {

        if ((feet <0) || (inches<0) && (inches >12))
        {

            return -1;
        }
        double cm=(feet*12)*2.54;
        cm += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = "+ cm +" cm");
        return cm;
    }
    public static double calcFeetAndInchesToCentimeter(double inches)
    {
        if (inches<0)
        {
            return -1;
        }
        double feet = (int) inches/12;
         double remainingInches = (int) inches %12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeter(feet, inches);
    }


}
