import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    public static boolean isTrue(int n){
        int[] arr = new int[]{2,3,4,5,6};
        for(int i = 0; i < arr.length; i++){
            if(n % arr[i] != 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        ArrayList<Integer> li = new ArrayList<Integer>();
        while(count < 4){
            i += 7;
            if(isTrue(i)){
                count += 1;
                if(count == 3){
                    continue;
                }
                   
                li.add(i);
            }
        }
        System.out.println(li);
    } 
}
