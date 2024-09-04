//X raised to N -> Power Function

public class recursion_5 {
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;       //Base Case 1
        }
        if ( x == 0) {
            return 0;       //Base Case 2
        }
        int xPower1 = calcPower(x, n-1);       //x^n =  x^(n-1) * x^1
        int xPower = x * xPower1;            //Recursive function
        return xPower;
    }
    public static void main(String[] args) {
       int x=4, n=4;
       int ans =calcPower(x, n);        //Assigning the values to  variables to print the ans
       System.out.println(ans);
    }
}
