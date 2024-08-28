import java.util.*;
public class TC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1; i<=n; i++ ) {  
            for (int j=1 ; j<n; j++)                                   //Time Complexity: O(N) 
            System.out.println("Yugandhar time - "+i);

        }
    }
}

/* Space Complexity 
  Space complexity of an algorithm quantifies the amount of time taken by a program to run as a function of length of the input.
  It is directly proportional to the largest memory your program acquires at any instance during run time. 
  For example: int consumes 4 bytes of memory.
 */