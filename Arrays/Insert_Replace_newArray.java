import java.util.Scanner;

public class Insert_Replace_newArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Enter the list of elements in an array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Step 2: Print the elements, their size, and all the elements
        System.out.println("\nArray Details:");
        System.out.println("Size of the array: " + size);
        System.out.print("Elements in the array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Step 3: Replace one element at a specific index with a different value
        System.out.print("\nEnter the index to replace: ");
        int indexToReplace = scanner.nextInt();

        if (indexToReplace < 0 || indexToReplace >= size) {
            System.out.println("Invalid index. Index should be between 0 and " + (size - 1));
        } else {
            System.out.print("Enter the new value: ");
            int newValue = scanner.nextInt();

            array[indexToReplace] = newValue;

            // Step 4: Print the new array
            System.out.println("\nNew Array after replacement:");
            for (int i = 0; i < size; i++) {
                System.out.println("Element at index " + i + ": " + array[i]);
            }
        }
    }
}