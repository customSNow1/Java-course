import java.util.Scanner;

public class Java_course {
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter empId");
        int id = sc.nextInt();
        System.out.println("Enter basic");
        double basic = sc.nextInt();
        System.out.println("Enter specialAllowances");
        double specAllowance = sc.nextInt();
        System.out.println("Enter percentage of bonus");
        double bonus = sc.nextInt();
        System.out.println("Enter monthly tax saving investments");
        double invest = sc.nextInt();
        
        double grossMonthly = basic + specAllowance;
        double grossAnnual = (grossMonthly*12);
        grossAnnual += (bonus/100)*grossAnnual;
        invest = invest * 12;
        
        if(invest > 150000){
            invest = 150000;
        }
        
        grossAnnual -= invest;
        double netAnnual, taxPayable;
        
        if (grossAnnual <= 250000){
            taxPayable = 0;
        }
        
        else if (grossAnnual > 250000 && grossAnnual < 500000){
            taxPayable = (0.05*grossAnnual);
        }
        
        else if (grossAnnual >= 500000 && grossAnnual < 1000000){
            taxPayable = (0.2*grossAnnual);
        }
        
        else{
            taxPayable = (0.3*grossAnnual);
        }
        
        netAnnual = grossAnnual - taxPayable;
        
        System.out.println("Annual gross: " + grossAnnual);
        System.out.println("Annual net: " + netAnnual);
        System.out.println("Tax payable: " + taxPayable);
        
    }
}
