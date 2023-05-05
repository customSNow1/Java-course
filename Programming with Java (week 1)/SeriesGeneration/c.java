import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    static ArrayList generate(int n){
        ArrayList<Integer> li = new ArrayList<>();
        int i = 1;
        while(true){
            double temp = Math.pow(i,i);
            if (temp > n){
                break;
            }
            li.add((int)temp);
            i += 1;
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
