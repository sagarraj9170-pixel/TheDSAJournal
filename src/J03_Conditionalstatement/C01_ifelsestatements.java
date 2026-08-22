package J03_Conditionalstatement;
import java.util.*;
public class C01_ifelsestatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age =16;
        if(age >=18) {
            System.out.println("adult: drive,vote");
        }
        if(age>13 && age<18){
            System.out.println("teenage");
        }
        else {
            System.out.println("not adult");
        }
    }
}
