import java.util.*;

public class subset_sum_numbers {
    public static void printSubset(ArrayList <Integer> subset) {
             for (int i = 0; i < subset.size(); i++) {
                System.out.println(subset.get(i)+ " ");
             }
    }
    public static void subSetSum (int n, ArrayList <Integer> subset) {

        if ( n == 0) {
            printSubset(subset);
            return;
        }
    
        //add hoga
        subset.add(0);
        subSetSum(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        subSetSum(n-1, subset);
    }
    public static void main(String[] args) {
       int n = 3;
       ArrayList <Integer> subset = new ArrayList <Integer>(); 
    }
}
