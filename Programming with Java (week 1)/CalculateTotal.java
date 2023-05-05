import java.util.Scanner;

public class Java_course {
    
    static String fun(int total){
        if (total >= 60){
            return "1st class";
        }
        else if (total >= 50){
            return "2nd class";
        }
        else if (total >= 35){
            return "Pass class";
        }
        return "failed class";
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        String name = sc.nextLine();
        System.out.println("Enter marks of three subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int avg = (m1+m2)/2;
        int total = m1+m2+m3;
        System.out.println("1st and 2nd average is: " + avg);
        System.out.println("Total marks is: " + total);
        System.out.println("Student has secured: " + fun(total));
    }
}
