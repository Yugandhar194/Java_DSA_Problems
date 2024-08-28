import java.util.*;
public class TC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1; i<=n; i++ ) {                                     //Time Complexity: O(N) 
            System.out.println("Yugandhar time - "+i);

        }
    }
}
/*  Time complexity is defined as the relationship between input size and running time operations 
 *  BEST CASE = Ω (n)
 *  AVERAGE CASE = θ (n)
 *  WORST CASE = O (1)
 *  We can even use 'Masters Theorem'
*/