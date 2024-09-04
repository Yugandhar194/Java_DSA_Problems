//Check whether the given array is sorted and strictly increasing

public class sorted_array_increasing {
    public static boolean isSortedArray(int arr[], int index) {     //Created the recursive function and passed arguments
        if (index == arr.length -1) {  //Traversing the entire array length (- 1) because indexes from zero and avoiding Exception Handling
            return true;                       
        }
        if (arr[index] < arr[index+1]) {
            //Array is sorted till now
            return isSortedArray(arr, index+1);     //Return true if it matches with the given condition else false
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,40,300,2000,10000};     //Array
        System.out.println(isSortedArray(arr, 0));      //Index initalised to zero
    }
}
    //Time Complexity : O(n) where 'n is the length of array'