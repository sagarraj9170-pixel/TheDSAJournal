package J06_Function;
import java.util.*;
public class C04_PSQ {

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args){
       int a=3;
       int b=5;
       int prod=multiply(a,b);
       System.out.println("a*b ="+prod);
       prod = multiply(20,2);//// if you give more multiplya only cal this things
       System.out.println("a*b ="+prod);
    }
}
