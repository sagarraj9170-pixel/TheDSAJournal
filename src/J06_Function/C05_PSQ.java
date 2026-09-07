package J06_Function;
import java.util.*;
public class C05_PSQ {

    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;

        }///////this is called function
        return f;
    }


    public static void main(String[] args){
        System.out.println(factorial(7 ));
    }/////this is call main function
}
