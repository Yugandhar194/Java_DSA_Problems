import java.util.Scanner;

public class TC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {           //Tine Complexity: O(N * M)
            for (int j = 0; j < m; j++) {
                System.out.println("Hello~World");
            }
        }
    }
}
