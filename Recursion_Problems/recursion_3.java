//Factorial Program using recursion function

public class recursion_3 {
    public static int calculateFactorial (int n) {      //Declaring a variable 'n' to print that number's factorial
        if (n == 1 || n == 0) {
            return 1;       // 1! OR 0! = 1 
        }
        int fact_num1 = calculateFactorial(n-1);   //BAse Case     
        int fact_num = n * fact_num1;            // N(N - 1)!
        return fact_num;        //Return N !
    }
    public static void main(String[] args) {
        int n = 7;
        int ans = calculateFactorial(n);    
        System.out.print(ans);          //(5*4*3*2*1 = 120)
    }
}
