package J05_Patterns;
import java.util.*;
public class C03_invertedPattern {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
int n=4;
        for (int line=1; line<=n; line++){
            for (int Star=1; Star<=n-line+1; Star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
