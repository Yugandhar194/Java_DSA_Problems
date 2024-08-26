import java.util.*;
public class solid_rect {
    public static void main (String args[]) {
        int n=4;
        int m=5;
        // Printing solid rectangle
        //Outer loop
        for (int i=1; i<=n; i++) {
            //Inner loop
            for(int j=1; j<=m;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}