package J06_Function;
import java.util.*;

public class C08_FunctionOverlodingDATAtype {

    public static int sum(int a,int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }



    public static void main(String[] args){
    System.out.println(sum(2,4));
    System.out.println(sum(12.5f,2.5f));


     }
}
