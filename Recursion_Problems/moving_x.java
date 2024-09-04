//Move all x to the end in the string

public class moving_x {
    public static void moveAllX(String str, int index, int count, String newString) {   //Recursion function passed with parameters

        if (index == str.length()) {        //Traversing index to entire length of the string
            for (int i=0; i < count; i++) {
                newString += 'x';   //Count the no. of x times in the newString
            }
            System.out.println(newString);
        }
        char currentChar = str.charAt(index);   //currentChar contains specific index
        if (currentChar == 'x') {       //Checks whether the string contains 'x' & increments the count
            count++;
            moveAllX(str, index+1, count, newString);   
        }
        else {
            newString += currentChar;       //newString = newString + currentChar
            moveAllX(str, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abxxc";                 //Given string
        moveAllX(str, 0, 0, " ");
    }
}
//Time Complexity : O(n) where 'n = n+n=2n and n is the length of string'