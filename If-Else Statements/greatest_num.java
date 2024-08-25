import java.util.*;
public class greatest_num {
    public static void main (String args[]) {
        int a,b,c;
        System.out.println("Enter the three numbers");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt(); 
        b=sc.nextInt();
        c=sc.nextInt();
        if (a>b && a>c) 
        System.out.println(+a+" is the greatest among the three");
        else if (b>a && b>c) {
            System.out.println(+b+" is the greatest among the three");
        } 
        else  {
            System.out.println(+c+" is the greatest among the three");
        }
    }
}
