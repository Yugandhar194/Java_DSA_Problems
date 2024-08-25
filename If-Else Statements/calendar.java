import java.util.*;
public class calendar {
    public static void main (String args[]) {
        int year;
        System.out.println("Enter any year you want: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year % 4 == 0 || year % 100 == 0 && year % 25 != 0) {
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is NOT a leap year");
        }
    }
}
