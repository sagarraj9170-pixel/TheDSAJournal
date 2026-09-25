package J05_Patterns;
import java.util.*;
public class C11_Butterfly_Pattern {
    public static void butterfly(int n){
        //1half
        for(int i=1; i<=n; i++){
            //stars-1
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //space -2*(n-1)
            for(int j=1; j<=2*(n-1); j++){
                System.out.print(" ");
            }

            //stare
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i<=1; i--){
            //stars-1
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int j=1; j<=2*(n-1); j++){
                System.out.print(" ");
            }

            //stare
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
     butterfly(4);
    }
}
