import java.util.*;
public class invert_hp {
    public static void main (String args[]) {
        int n = 4;
        //Inverted Half Pyramid
        //Outer loop
        for (int i=n; i>=1; i--) {
            //Inner loop 
            {
                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}