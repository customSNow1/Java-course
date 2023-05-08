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
        int k = 1;
        int prev = 1;
        System.out.println(1);
        for(int i = 2; i <= n; i++){
            String pat = "";
            for(int j = 1; j <= i; j++){
                prev = prev * k;
                k += 1;
                pat += Integer.toString(prev) + " ";
                
            }
            System.out.println(pat);
        }
        
        
    } 
}
