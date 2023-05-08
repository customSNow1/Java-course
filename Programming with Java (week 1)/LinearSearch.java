import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    static String linearSearch(ArrayList<Integer> li, int x){
        for(int i = 1; i <= li.size(); i++){
            if(li.get(i-1) == x){
                return "Element found at position: " + i;
            }
        }
        return "Element not found";
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
        System.out.println("Enter number to be searched: ");
        int x = sc.nextInt();
        System.out.println(linearSearch(li,x));
        
    } 
}
