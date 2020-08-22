class BytesConverter {

    public  static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes > 0) {
            int mb=kiloBytes/1024;
            int remainingKb=kiloBytes%1024;
            System.out.println(kiloBytes+
                    " KB = "
                    +mb+
                    " MB"+
                    " and "+
                    remainingKb+
                    " KB");
        } else
        {
            System.out.println("Invalid Value");
        }
    }
}
