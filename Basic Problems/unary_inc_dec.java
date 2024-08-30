import java.util.*;
public class unary_inc_dec {

     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Post Increment
        {
         int a = 10;
         int b=0;
         b = a++;
         System.out.println(a);
         System.out.println(b);
        }

        //Pre increment
        {
         int c = 10;
         int d = 0;
         d = ++c;
         System.out.println(c);
         System.out.println(d);
        }

        //Post Decrement
        {
            int e = 10;
            int f = 0;
            f = e--;
            System.out.println(e);
            System.out.println(f);
        }

        //Pre Decrement
        {
            int g = 10;
            int h = 0;
            h = --g;
            System.out.println(g);
            System.out.println(h);
        }

     }
}