package J06_Function;
import java.util.*;

public class C09_printNumIsPrimeorNot {

//corner cases
    public static boolean isPrime(int n){
        boolean isprime =true;
        for (int i=2; i<=n-1; i++){
            if( n % i == 0){ /// completely dividing
                isprime= false;
            }
        }
        return  isprime;
    }


    public static void main(String[] args){
        System.out.println(isPrime(12));// not prime number
    }
}
