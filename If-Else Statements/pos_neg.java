import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        if (i>0)
        {
            System.out.println("It is a positive number: "+i);
        }
        else if (i<0)
        {
            System.out.println("It is a negative number: "+i);
        }
        else
        {
            System.out.println("It is zero: "+i);
        }
    }
}
