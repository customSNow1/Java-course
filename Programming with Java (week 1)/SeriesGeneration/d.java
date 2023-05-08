import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    static ArrayList generate(int n){
        ArrayList<Integer> li = new ArrayList<>();
        int[] arr = new int[]{1,4,7};
        
        int n1 = 1, n2 = 4, n3 = 7;
        li.add(n1);
        li.add(n2);
        li.add(n3);
        int curr = 0;
        
        while(true){
            curr = n1+n2+n3;
            if(curr > n){
                break;
            }
            li.add(curr);
            n1 = n2;
            n2 = n3;
            n3 = curr;     
        }
        return li;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        ArrayList<Integer> li = generate(n);
        System.out.println(li);
        
        
        
    }
}
