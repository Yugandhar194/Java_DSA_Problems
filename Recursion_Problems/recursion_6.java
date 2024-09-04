//X raised to N -> Power Function (Stack Height -> log n)

public class recursion_6 {
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;       //Base Case 1
        }
        if ( x == 0) {
            return 0;       //Base Case 2
        }
        // If n is even
        if (n % 2 == 0) {
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        else {  //n is odd
            return calcPower(x, n/2) * calcPower(x, n/2) * n;
        }
    }
    public static void main(String[] args) {
       int x=2  , n=4;
       int ans =calcPower(x, n);        //Assigning the values to  variables to print the ans
       System.out.println(ans);
    }
}
