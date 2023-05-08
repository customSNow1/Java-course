import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:  ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String pat = "";
            for(int j = 0; j < 5; j++){
                pat += '*';
            }
            System.out.println(pat);
        }
        
        
    } 
}
