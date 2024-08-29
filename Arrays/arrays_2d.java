import java.util.Scanner;

public class arrays_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int rows = sc.nextInt();        //Taking no. of rows as input
        int cols = sc.nextInt();        //Taking no. of columns as input

        int numbers [][] = new int[rows][cols];

        //Input
        //Rows

        for (int i=0; i<rows;i++ ){
            //Columns
            for (int j=0; j<cols; j++) {
                numbers[i][j]=sc.nextInt();         //Printing the elements for rows & columns
            }
        }

        //Output
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(numbers[i][j]+ " ");
            }
        }
        System.out.println();
    }
}