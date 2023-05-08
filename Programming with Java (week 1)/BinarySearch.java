import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    static String binarySearch(ArrayList<Integer> li, int start, int end, int x){
        if(start > end){
            return "Element not found";
        }
        if(start == end && li.get(end) != x){
            return "Element not found";
        }
        int mid = (start + end)/2;
        if(li.get(mid) == x){
            return "Element found at position: " + mid;
        }
        if(li.get(mid) > x){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
        String temp = binarySearch(li,start,end,x);
        return temp;
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
        Collections.sort(li);
        System.out.println(binarySearch(li,0,li.size()-1,x));
        
    } 
}
