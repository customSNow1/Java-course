import java.util.Scanner;

public class Java_course {
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x and n values: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = 1;
        for(int i = n; i > 0; i--){
            res *= x;
        }
        System.out.println("result: "+ res);
        
    }
}
