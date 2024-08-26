public class pyramind_num {
    public static void main(String[] args) {
        int n=5;
        for (int i=1; i<n; i++) {
            //spaces
            for (int j=1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //numbers -> print row no. row number of times
            for (int j=i; j<=i;j++ ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
