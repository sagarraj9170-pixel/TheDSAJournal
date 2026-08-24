package J03_Conditionalstatement;
import java.util.*;
public class C07_TernaryOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
     int number =6;

     //ternary operator not if else

        String type = ((number%2)==0)?"even":"odd";
        System.out.println(type);

    }
}
