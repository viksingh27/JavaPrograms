class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(12,15,61);
    }
    public static boolean hasTeen(int a, int b, int c)
    {
        System.out.println("has Teen");
        boolean b1 = a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
        return b1;
    }
    public static boolean isTeen(int a)
    {
        System.out.println("is teen");
        boolean b = a >= 13 && a <= 19;
        return b;
    }
}
