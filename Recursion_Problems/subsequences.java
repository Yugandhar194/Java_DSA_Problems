public class subsequences {
    public static void subSequences(String str, int index, String newString) {      //Recursive function

        if (index == str.length()){
            
            System.out.println(newString);      //Base Case
            return;
        }
        char currentChar = str.charAt(index);       

        //to be
        subSequences(str, index+1, newString+currentChar);      //Current Char + newString added

        //or  not to be
        subSequences(str, index+1, newString);      //Current Char + newString is not added 
    }
    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, " ");      //Paraeters passed in the function and it is calling
    }
}
