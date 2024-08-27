import java.util.*;
public class factorial_function {
    public static void printFactorial(int n) {          //Creating a function
        int factorial = 1;
        for (int i=n; i>=1; i--) {  
            factorial = factorial * i;      //For loop logic for factorial program
        }
        System.out.println("Factorial of the number "+n+" is = "+factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
