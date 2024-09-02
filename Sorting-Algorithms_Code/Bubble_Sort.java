import java.util.Scanner;

public class Bubble_Sort {

    public static void printArray(int arr[] ) {     //Created a function to print the array of function
        for (int i=0; i < arr.length; i++) {       //Outer loop for n-1 iterations
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {    //Bubble Sort - length decreases from back_side

      int arr[] = {5,4,3,2,1};

      //bubble sort -> will run the loop 'n-1' times, where n is the no. of elements

      for (int i = 0; i < arr.length-1; i++) {     
        for (int j = 0; j < arr.length-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                    //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;        //Time Complexity: O(n^2)
            }
        }
        printArray(arr);        //Calling the print() function
      }
    }
}