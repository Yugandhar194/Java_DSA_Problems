public class permutations_string {

       //Recursive Function
       public static void printPerm(String str, String permutation) {

              //Base Case
              if (str.length() == 0) {
                     System.out.println(permutation);
                     return;
              }

              //Intution -> Logic behind the code

              for (int i= 0; i < str.length(); i++) {
                     char currentChar = str.charAt(i);
                     String newStr = str.substring(0, i) + str.substring(i+1);
                      printPerm(newStr, permutation+currentChar);
              }

       }
       public static void main(String[] args) {

              //Calling function inside the main function
              // '(str)! = the no. of characters inside the string'
              String str = "YUG";
              printPerm(str, " ");

              //Time Complexity : O ( n!)
           
       }
}