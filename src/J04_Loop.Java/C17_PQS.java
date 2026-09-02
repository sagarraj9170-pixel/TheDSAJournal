package J04_Loop.Java;
import java.util.*;

public class C17_PQS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int fact=1;

        System.out.println("enter any positive integer:");
        num=sc.nextInt();

        for (int i=1; i<=num; i++){
            fact *=i;

        }
        System.out.println("Factorial: "+fact);
    }
}
