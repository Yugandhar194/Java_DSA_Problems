//Calculate sum of first n natural numbers

public class recursion_2 {

    public static void calculateSum(int i, int n , int sum ) {      //Function with parameters passed 'i / n / sum'
        if (i == n) {
            sum += i;       // Base-case
            System.out.println(sum);    //Print the sum
            return;
        }
        sum += i;       //Increment i by 1 to add in the sum
        calculateSum(i+1, n, sum);
    }
    public static void main(String[] args) {    //Main function
        calculateSum(1,7, 0);      //Passed the arguments until condtion satisfies  //Function calling
    }
}
