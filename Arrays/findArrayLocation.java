import java.util.Scanner;

public class findArrayLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the elements of the array: ");
        int size = sc.nextInt();            //Declaring the size of array
        int numbers[] = new int[size];      //Enter the elements present inside the array
        
        //input
        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();      //For loop to enter the elements within the bounds of an array
        }
        int x = sc.nextInt();       //To find that specific element from the array

        //output
        for (int i=0; i<size; i++) {
            if (numbers[i]==x) {            //Checking the 'if' condition whether the element is present or not
                System.out.println(+x+ " occurs at index number "+i);
            }
        }
    }
     
}