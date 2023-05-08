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
        int count = 0;
        for(int i = 1; i <= n; i++){
            String pat = "";
            for(int j = 1; j <= i; j++){
                int temp = k*k;
                k += 1;
                count += 1;
                if(count % 2 == 0){
                    pat += "-" + Integer.toString(temp) + " ";
                }
                else{
                    pat += Integer.toString(temp) + " ";
                }
                
            }
            System.out.println(pat);
        }
        
        
    } 
}
