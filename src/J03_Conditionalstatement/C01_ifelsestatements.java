package J03_Conditionalstatement;
import java.util.*;
public class C01_ifelsestatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc .nextInt();
        if(age >=18) {
            System.out.println("adult: drive,vote");
        }
        if(age>13 && age<18){
            System.out.println("teenage");
        }
        if(age>35 && age<75){
            System.out.println("can make political party");
        }
        else {
            System.out.println("not adult");
        }
    }
}
