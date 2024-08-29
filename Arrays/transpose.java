import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Declaring the number of (rows*cols = m*n) in the matrix
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[m][n];     //Matrix created successfully!!

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {

                matrix[i][j] = sc.nextInt();    //Entered those elements of an array
            }
        }

        System.out.println("The transpose matrix \n as follows :  ");

        for (int j=0; j<m; j++) {
            for (int i=0; i<n; i++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}
