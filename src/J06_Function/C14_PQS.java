package J06_Function;
import java.util.*;
public class C14_PQS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer:");
        num =sc.nextInt();

        if (isEven(num)){
            System.out.println("Number is  even number");

        }
        else{
            System.out.println("number is odd number");
        }
    }
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
