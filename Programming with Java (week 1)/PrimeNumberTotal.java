import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    public static boolean isPrime(int n)
    {
        if (n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 2; i*i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for(int i = n; i <= m; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println("sum:" + sum);
    } 
}
