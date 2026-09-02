package J04_Loop.Java;
import java.util.*;

public class C16_PQS {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        int number;
        int choise;
        int evenSum =0;
        int oddSum =0;


        do {
            System .out.print("enter the number");
            number = sc.nextInt();

            if (number%2 ==0){
                evenSum +=number;

            }
            else {
                oddSum +=number;
            }
            System.out.print("do you want to continue press 1 for yes or 0 for no");

            choise = sc.nextInt();

        }
        while (choise==1);

        System.out.println("Sum of even number : "+ evenSum);
        System.out.println("sum mod odd number :"+oddSum);

    }
}
