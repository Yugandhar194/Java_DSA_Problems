import java.util.Scanner;
public class add {
    public static void main (String args []) { 
        int a, b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        c=a+b;
        System.out.println("Addition of "+a+" and "+b+"  is: "+c);
    }
}