//Print numbers from 5 to 1

public class recursion_1 {      //Class declaration

    public static void printNumb(int n)         //Creating a recursive-function called 'printNumb'
    {
        if (n == 0) {
            return;         //Base case
        }
        System.out.println(n);
        printNumb(n-1);     //Decrement the variable until 'base-case' satisfies
    }   
    public static void main(String[] args) {        //Main function
        int n = 6;     //Variable initalised and declared
        printNumb(n);       //function calling
    }   
}