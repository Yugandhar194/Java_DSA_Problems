import java.util.*;
public class product_function {
    public static  int calculateProduct(int a, int b) {     //Created function
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();       //Creating a and b variables
        int b = sc.nextInt();
        int sum = calculateProduct(a, b);       //Calling the function
        System.out.println("Product of two numbers is "+sum);
    }
}