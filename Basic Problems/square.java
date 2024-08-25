import java.util.Scanner;

public class square {
    public static void main(String[] args) { 
        Scanner sc = new Scanner (System.in);
        int num,sqr;
        System.out.print("Enter the no. whose square you want: ");
        num=sc.nextInt();
        sqr=num*num;
        System.out.println("The square of the number : "+num+" ^2 = " +sqr);
    }
}
