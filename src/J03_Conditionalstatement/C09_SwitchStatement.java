package J03_Conditionalstatement;
import java.util.*;

public class C09_SwitchStatement {
    public static void main(String[] ages) {
        Scanner sc = new Scanner(System.in);
       System.out.println("number:-");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.print("mango shake");
                break;
            default:
                System.out.print("we wake up");
        }
    }
}
