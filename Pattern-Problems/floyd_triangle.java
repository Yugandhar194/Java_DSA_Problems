public class floyd_triangle {

    public static void main (String args[]) {
        int n=5;                // 1 \n 2 3 \n 4 5 6 \n...
        int number = 1;
        //Outer loop
        for (int i=1; i<= n; i++) {
            //Inner loop
            for (int j=1; j<=i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}