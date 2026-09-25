package J05_Patterns;
import java.util.*;

public class C12_Solid_Rhombus {
    public static void soliderhombus(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n=i); j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        soliderhombus(5);
    }
}
