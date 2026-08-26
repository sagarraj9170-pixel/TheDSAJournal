package J03_Conditionalstatement;
import java.util.*;
public class C08_passOrfail {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int marks=33;

        String reportCard = marks>=33? "pass":"fail";
        System.out.println(reportCard);
    }
}
