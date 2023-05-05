import java.util.Scanner;

public class Java_course {
    
    static String checkEven(int num){
        if (num % 2 == 0){
            return "even number";
        }
        return "odd number";
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println(checkEven(num));
        
    }
}
