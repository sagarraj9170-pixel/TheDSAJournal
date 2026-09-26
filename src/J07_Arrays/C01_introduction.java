package J07_Arrays;
import java.util.*;
public class C01_introduction {
    public static void main(String[] args){
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        //phy=sc.nextInt();

        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//chem
        marks[2] = sc.nextInt();//math

        System.out.println("phy:"+marks[0]);
        System.out.println("chem:"+marks[1]);
        System.out.println("math:"+marks[2]);

        //if  can chnage the
        // number or mark
      //  marks[2] = 100;
      //  marks[2] = marks[2] + 1;
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = "+percentage +"%");



        //how to chk the lenth of array
        System.out.println("lenth of array =" + marks.length);
    }
}
