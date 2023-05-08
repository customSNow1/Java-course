import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
     public static int findGCD(int num1, int num2)
    {
        if (num2 == 0)
            return num1;
        return findGCD(num2, num1 % num2);
    }
 
    public static int findLCM(ArrayList<Integer> arr)
    {
        int lcm = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int n1 = lcm;
            int n2 = arr.get(i);
            int gcd_val = findGCD(n1, n2);
            lcm = (lcm * arr.get(i)) / gcd_val;
        }
        return lcm;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total no. of numbers in the array: ");
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        System.out.println("enter the array elements: ");
        for(int i = 0; i < n; i++){
            li.add(sc.nextInt()); 
        }
        System.out.println("LCM is: " + findLCM(li));
    } 
}
