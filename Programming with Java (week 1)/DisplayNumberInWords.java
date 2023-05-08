import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    public static String toWord(int n){
        
        switch(n){
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 0: return "Zero";
        }
        return "error";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        String res = "";
        for(int i = 0; i < s.length(); i++){
            String temp = toWord(s.charAt(i) - '0');
            res += temp + " ";
        }
        System.out.println(res);
    } 
}
