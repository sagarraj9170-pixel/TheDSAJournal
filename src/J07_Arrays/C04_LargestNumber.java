package J07_Arrays;
import java.util.*;
public class C04_LargestNumber {
    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;

        for (int i=0; i< numbers.length; i++){
            if(largest < numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest is value is :"+smallest);
        return largest;
    }
    public static void main(String[] args){
        int number[] = {1,2,6,4,5};
        System.out.println(" largest value is :" + largestNumber(number));
    }
}
