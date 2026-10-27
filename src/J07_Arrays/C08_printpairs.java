package J07_Arrays;
import java.util.*;
public class C08_printpairs {
    public static void printpairs(int numbers[]){

        int tp=0;
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i]; //2,,4,6,8,10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+ current + "," + numbers[j] + ") ");
            tp++;
            }

            System.out.println();
            System.out.println("total pairs ="+tp);
        }
    }

    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        printpairs(numbers);
    }
}