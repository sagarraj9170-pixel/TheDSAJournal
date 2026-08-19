package J02_Operators;
import java.util.*;

public class C11_PQS {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int  x = 100 , y = 50 , z = 200;
        if(x>y && y>z){
            System.out.println("Hello");
        }
        if (z>y && z>x){ // i have change it <
            System.out.println("Java");
        }
        if ((y+200)<x && (y+150)<z){
            System.out.println("hellojava");
        }
    }
}
