package J05_Patterns;
import java.util.*;

public class C02_INVERTEDstarPattern {
    public static void main(String[] args){
    Scanner sc =new Scanner(System .in);



        for(int line=1; line<=5; line++){

            for(int star=5;star>=line; star--){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}