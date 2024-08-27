import java.util.*;
public class add_sum {
    public static  int calculateSum(int a, int b) {     //Created function
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();       //Creating a and b variables
        int b = sc.nextInt();
        int sum = calculateSum(a, b);       //Calling the function
        System.out.println("Sum of two numbers is "+sum);
    }
}