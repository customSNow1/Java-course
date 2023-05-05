import java.util.*;


public class Java_course {
    
    static ArrayList generate(int n){
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i = 2; i*i <= n; i+=2){
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
