package J05_Patterns;
import java.util.*;

public class C09_Floyds_triangle {
    public static void floyds_traingle(int n){
        //outter loop
        int counter=1;
         for(int i=1; i<=n; i++){
             //innner -how many time will counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        floyds_traingle(4);
    }
}
