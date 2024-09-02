import java.util.Scanner;
public class Selection_Sort {
    public static void printArray(int arr[] ) {     //Created a function to print the array of function
        for (int i=0; i < arr.length; i++) {       //Outer loop for n-1 iterations
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {    //Selection Sort - length decreases from front_side
        
        int arr[] = {7,8,3,1,2};
        //Time Complexity: O(n^2)

        for (int i = 0; i < arr.length; i++) {  //outer loop will run 'n-1' times
          int smallest = i;     //considering the first index then second then third & then so on...
          for (int j=i+1; j < arr.length; j++) {
            if (arr[smallest] > arr[j]) {
                smallest = j;       //Checking whether the current element is greater than the smallest element
            }
          }
          int temp = arr[smallest];     //If yes then swap
          arr[smallest] = arr[i];
          arr[i] = temp;
        }
        printArray(arr);
    } 
}