package J04_Loop.Java;
import java.util.*;
public class C10_BreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("i an out of the loop");
    }
}
