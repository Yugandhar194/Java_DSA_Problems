public class removing_duplicates {
    public static boolean map [] = new boolean [26];        //Array declare to store all unique alphabets
        
    public static void removeDuplicates (String str, int index, String newString) { //FUnction parameters 'oldString, Index, newString'
       if (index == str.length()) {
        System.out.println(newString);      //If we are at the end of string then 'print the entire string'
        return;
       } 
       char currentChar = str.charAt(index);
       if (map[ currentChar - 'a'] ) {
       removeDuplicates(str, index+1, newString);      // current char - 'a' & its REPEATED then it will NOT be added in newString 
    } else {
        newString += currentChar;
        map[ currentChar - 'a'] = true;
        removeDuplicates(str, index+1,  newString);    // current char - 'a' & its NOT~REPEATED then it will  be added in newString 
    }
}
    public static void main(String[] args) {
        String str = "mummy";         //String name
        removeDuplicates(str, 0, " ");      // Parameters = oldString, zero-indexed, empty=newString
    }
}
