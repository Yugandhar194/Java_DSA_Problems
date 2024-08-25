import java.util.*;
public class perim_area {
    public static void main (String args[]) {

        int x,y,perim,area;             //Declaring variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");         
        x=sc.nextInt();                 //Taking length as input from user
        System.out.println("Enter the breadth of rectangle : ");
        y=sc.nextInt();                 //Taking breadth from user
        perim = 2*(x+y);
        area = x*y;                     //Formula
        System.out.println("Perimeter of the rectangle is : "+perim);
        System.out.println("Area of the rectangle is : "+area);             //Show the output :-)
    }
}