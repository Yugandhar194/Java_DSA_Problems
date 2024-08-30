import java.util.Scanner;

public class operators {

   public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter two numbers: ");

      int a = sc.nextInt();
      int b = sc.nextInt();
      float c;
      
      //All the Binary operations
     
      c = a + b;
      System.out.println("Sum is: "+c);                            //Addition

      c = a - b;
      System.out.println("Difference is: "+c);                    //Subtraction

      c = a * b;
      System.out.println("Product is: "+c);                       //Multiplication

      c = a / b;
      System.out.println("Division is: "+c);                      //Division

      c = a % b;
      System.out.println("Remainder after the division is "+c);   //Modulo division

   }
}