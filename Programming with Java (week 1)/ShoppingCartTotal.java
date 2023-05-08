import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    static String numberToWords(long n)
    {
        long limit = 1000000000000L, curr_hun, t = 0;
        if (n == 0)
            return ("Zero");
  
        String multiplier[] = { "", "Trillion", "Billion",
                                "Million", "Thousand" };
  
        String first_twenty[] = {
            "",        "One",       "Two",      "Three",
            "Four",    "Five",      "Six",      "Seven",
            "Eight",   "Nine",      "Ten",      "Eleven",
            "Twelve",  "Thirteen",  "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };
  
        String tens[] = { "",        "Twenty", "Thirty",
                          "Forty",   "Fifty",  "Sixty",
                          "Seventy", "Eighty", "Ninety" };
  
        
        if (n < 20L)
            return (first_twenty[(int)n]);
        String answer = "";
        for (long i = n; i > 0; i %= limit, limit /= 1000) {
  
            curr_hun = i / limit;
            while (curr_hun == 0) {
                i %= limit;
                limit /= 1000;
                curr_hun = i / limit;
                ++t;
            }

            if (curr_hun > 99)
                answer += (first_twenty[(int)curr_hun / 100]
                           + " Hundred ");
  
            curr_hun = curr_hun % 100;
            if (curr_hun > 0 && curr_hun < 20)
                answer
                    += (first_twenty[(int)curr_hun] + " ");
            else if (curr_hun % 10 == 0 && curr_hun != 0)
                answer
                    += (tens[(int)curr_hun / 10 - 1] + " ");
  
            else if (curr_hun > 20 && curr_hun < 100)
                answer
                    += (tens[(int)curr_hun / 10 - 1] + " "
                        + first_twenty[(int)curr_hun % 10]
                        + " ");
  
            if (t < 4)
                answer += (multiplier[(int)++t] + " ");
        }
        return (answer);
    }
    
  
  public static double computeGrandTotal(double total, String mode){
        if(total > 10000){
            total = total - (0.10*total);
            
        }
        if(total < 1000 && mode.equals("card")){
            total = total + (0.25*total);
            
        }
        return total;
    }
    
  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.println("enter 'y' to add items for billing");
        while(sc.nextLine().equals("y")){
            System.out.println("enter item code, description, qty and price of the item: ");
            String code = sc.nextLine();
            String description = sc.nextLine();
            int quantity = sc.nextInt();
            double price = sc.nextDouble();
            total += (quantity*price);
            sc.nextLine();
            System.out.println("enter 'y' to add items for billing");
        }
        System.out.println("Total is : " + total);
        System.out.println("Enter mode of payment: ");
        String mode = sc.nextLine();
        double grandTotal = computeGrandTotal(total, mode);
        System.out.println("Grand total is: " + grandTotal);
        System.out.println("Grand total (in words) is: " + numberToWords((long)grandTotal));
    } 
}
