public class invert_hp_2 {
    public static void main (String args[]) {
        //Inverted half pyramid (Rotated by 180 degree)
        //Outer Loop
        int n=4;
        for (int i=1; i<=n;i++) {
            //Inner loop -> space
            for (int j=1; j<=n-i;j++) {
                //Inner loop -> star
                System.out.print(" ");
            }
            for (int j=1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
