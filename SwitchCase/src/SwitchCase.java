public class SwitchCase {
    public static void main(String[] args) {
        char charTest = 'e';
        switch (charTest)
        {
            case 'a' :
                System.out.println("Value was a");
                break;
            case 'b' :
                System.out.println("Value was b");
                break;
            case 'c' : case 'd' : case 'e':
                System.out.println("Value was "+charTest);
                break;
            default:
                System.out.println("Invalid value");
                break;
        }

    }
}
