package J06_Function;
import java.util.*;
public class C11_BinaryToDecimal {
    public static void binToDce(int binInNum){
        int myNum = binInNum;
        int pow =0;
        int decNum = 0;

        while (binInNum>0){
            int lastDigit = binInNum % 10;
            decNum = decNum + (lastDigit*(int)Math.pow(2,pow));

            pow++;
            binInNum = binInNum/10;
        }
System.out.println("decimal of "+myNum+"=" +decNum);
    }

    public static void main(String[] args){
    binToDce(011);


    }
}
