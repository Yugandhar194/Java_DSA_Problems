public class string_occurence {
    public static int first = -1;       //Declare static variables and kept them initalised as '-1'
    public static int last = -1;
    public static void printStringOccurence(String str, int index , char element) {
        if (index == str.length())
        {
            System.out.println(first);
            System.out.println(last);       
            return;                         //Base Case
        }
        char currentChar = str.charAt(index);       //Created currentChar and checked with the current element
        if (currentChar == element) {               //If occured then assigned as first else check with the last occurence
            if (first == -1) {
                first = index;      //First initalised
            }
            else {
                last = index;
            }
        }

        printStringOccurence(str, index+1, element);        //Increment the value of index to traverse the index
    }
    public static void main(String[] args) {
        String str ="Yugandhar Dear";
        printStringOccurence(str, 0, 'a');      //Passed the element value, index is initaised to zero
    }
}

//Time Complexity : O(n) where 'n is the length of string'