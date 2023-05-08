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
        for(int i = 1; i <= n; i++){
            String pat = "";
            for(int j = 1; j <= 5; j++){
                pat += Integer.toString(j);
            }
            System.out.println(pat);
        }
        
        
    } 
}
