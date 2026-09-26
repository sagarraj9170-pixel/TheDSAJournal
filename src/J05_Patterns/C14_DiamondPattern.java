package J05_Patterns;
import java.util.*;
public class C14_DiamondPattern {
    public static void diamond(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.println(" ");
            }
            //stare
            for(int j=1; j<=(2*i)-1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.println(" ");
            }
            //stare
            for(int j=1; j<=(2*i)-1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
           diamond(4);
    }
}
