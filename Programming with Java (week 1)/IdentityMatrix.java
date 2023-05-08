import java.util.*;


/**
 *
 * @author ku1b
 */
public class Java_course {
    
    static String checkIdentityMatrix(int arr[][], int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (i == j){
                    if (arr[i][j] !=1){
                        return "Not an identity matrix";
                    }
                    
                }
                else{
                    if(arr[i][j] != 0){
                        return "NOT an identity matrix";
                    }
                }
                
            }
        }
        return "It is an identity matrix";
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:  ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("enter the matrix:  ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(checkIdentityMatrix(arr, n));
        
    } 
}
