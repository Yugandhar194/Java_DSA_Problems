import java.util.*;
public class driving {
    public static void main (String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if (age >= 150 || age < 0)
        {
            System.out.println("Invalid age entered");
        }
        else if (age >= 18 && age <= 149) {
            System.out.println("You can drive");
        }
        else {
            System.out.println("You cannot drive");
        }
    }
}