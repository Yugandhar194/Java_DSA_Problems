import java.util.*;
public class Insertion_Sort {
    public static void printArray(int arr[]) {
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        {
            for (int i=0; i<arr.length; i++) {
                int current = arr[i];   //Pick an element fro unsorted and keep it on the sorted array position
                int j = i - 1;

                while (j >= 0 && current < arr[j]) {   //j-- for sorting
                    arr[j+1] = arr[j];
                    j--;        //Insertion sort individually checks & runs loop 'n-1' times
                }               // in order to get it sorted from unsorted array/list
                //placement
                arr[j+1] = current;
            }
            printArray(arr);
        }
    }
}