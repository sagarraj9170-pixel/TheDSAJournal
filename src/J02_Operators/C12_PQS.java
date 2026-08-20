package J02_Operators;
import java.util.*;

public class C12_PQS {
 public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
     int x, y, z;
     x = y = z = 2 ;//A=A+2
     x += y;
     y -= z;  //y=z-2;
     z /= (x+y);
     System.out.println(x + " " + y + " " + z);
 }
}
