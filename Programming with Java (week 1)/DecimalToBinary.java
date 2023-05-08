import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    public static String convertToDecimal(int n){
        String temp = "";
        String res=  "";
        while(n != 0){
            temp += Integer.toString(n%2);
            n /= 2;
        }
        
        for(int i = temp.length()-1; i >= 0; i--){
            res += temp.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("binary value is: " + convertToDecimal(n));
        
    } 
}
