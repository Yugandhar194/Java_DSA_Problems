import java.util.Scanner;
public class bodmass {
    public static void main (String args []) {
        int a, b;
        float c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        c=a+b;
        System.out.println("Addition of both the numbers is: "+c);
        c=a-b;
        System.out.println("Subtraction of both the numbers is: "+c);
        c=a*b;
        System.out.println("Multiplication of both the numbers is: "+c);
        c=a/b;
        System.out.println("Division of both the numbers is: "+c);
    }
}
