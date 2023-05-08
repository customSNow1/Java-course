import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i <= j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("NOT a palindrome");
        }
    } 
}
