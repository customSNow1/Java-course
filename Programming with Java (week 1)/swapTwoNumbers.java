import java.util.Scanner;


public class Java_course {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("num1:" + num1 + " num 2:" + num2); 
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: " + "num1:" + num1 + " num 2:" + num2);
    }
}
