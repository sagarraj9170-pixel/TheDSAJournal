package J05_Patterns;
import java.util.*;
public class C07_Inverted_rotated_half_pyramide {
    public static void inverted_rotatad_half_pyramide(int n){

        //outer
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
        }
            System.out.println();
        }

    }

    public static void main(String[] args){
        inverted_rotatad_half_pyramide(4);
    }

}
