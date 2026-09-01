package J04_Loop.Java;
// jast skip tha ramdam ruber
import java.util.*;

public class C12_ContinueStatement {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n; i++){
            if(i==45){
                continue;
            }
            System.out.println(i);
        }
    }
}
