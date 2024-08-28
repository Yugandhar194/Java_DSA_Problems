import java.util.Scanner;

public class TC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {           //Time Complexity: O(N^2)
            for (int j = 0; j < n; j++) {
                System.out.println("Hello~World");
            }
        }
    }
}
/*  O(n^n) > O(n!) > O(n3) > O(n2) > O(n.log(n)) > O(n.log(log(n))) > O(n) > O(sqrt(n)) > O(log(n)) > O(1) 

    Note:   Reverse is the order for better performance of a code with corresponding time complexity, 
            That means a program with less time complexity is more efficient. 
 */