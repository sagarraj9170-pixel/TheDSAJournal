package J06_Function;
import java.util.*;
public class C07_SyntexofParameters {
    public static void printHelloWorld(){
     System.out.println("Hello World");
     System.out.println("hello world");
     System.out.println("hello World");

    }


public static int calculateSum(int num1,int num2){//this is call parameters
    int sum = num1+ num2;
  return sum;/////parameters or formal parameters

}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
          int sum =  calculateSum(a,b);//a oe b arugment hain
        System.out.println("sum is : "+sum);
    }





}
