import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    static ArrayList generate(int n){
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if (i % 4 == 0){
                continue;
            }
            li.add(i*i);
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
