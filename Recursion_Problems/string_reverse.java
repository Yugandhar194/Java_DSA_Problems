//Reverse the given string using recursion

public class string_reverse {
    public static void printRev(String str, int index) {    //Creating the Recursive function
        if (index == 0) {
            System.out.println(str.charAt(index));      //Base Case
            return;
        }
        System.out.print(str.charAt(index));
        printRev(str, index-1);     //Method to reverse the string
    }
    public static void main(String[] args) {
        String str = "Yugandhar";
        printRev(str, str.length()-1);      //Recursion Function Calling
    }
}
    //Time Complexity : O(n) where 'n = length of the String'