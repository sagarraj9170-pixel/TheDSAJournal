package J07_Arrays;
import java.util.*;

public class C07_linerasearch {
    public static int linearSearch(String menu[], String key){

        for(int i=0; i<menu.length; i++){
            if(menu[i].equals (key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String menu[] = {"dosa","chlo","bhatura","samosa"};
        String key= "chlo";
        int index = linearSearch(menu,key);
        if(index ==-1){
            System.out.println("NOT found");
        }else{
            System.out.println("key is at index:" + index);

        }
    }
}
