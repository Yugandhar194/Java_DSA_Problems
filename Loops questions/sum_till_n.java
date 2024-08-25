import java.util.*;
public class sum_till_n {
    //Print sum of n natural numbers - 'n': number entered by user
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int i,n;
        n=sc.nextInt();
        for (i=1; i<=n; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}