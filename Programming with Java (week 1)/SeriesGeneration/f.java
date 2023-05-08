import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    static ArrayList generate(int n){
        ArrayList<Integer> li = new ArrayList<>();
        int curr = 1;
        int i = 0;
        while(curr <= n){
            
            i += 4;
            if(i % 3 == 0){
                continue;
            }
            curr += i;
            li.add(curr);
            
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
