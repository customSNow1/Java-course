import java.util.Scanner;


public class Java_course {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal, rate of interest and time period: ");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int SI = (p*r*t)/100;
        
        System.out.println("Simple interest is: " + SI);
    }
}
