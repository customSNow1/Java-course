import java.util.*;

public class Java_course {
    
    static String reverse(String str){
        String res = "";
        for (int i = str.length()-1; i >= 0; i--){
            res += str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        String temp = Integer.toString(num);
        temp = reverse(temp);
        System.out.println(temp);
        
        
    }
}
