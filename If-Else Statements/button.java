import java.util.*;
public class button {

    public static void main (String args[]) {
        int button;
        Scanner sc = new Scanner(System.in);
        button = sc.nextInt();
        if (button == 1) {
            System.out.println("Jai Shree Ram");
        }
        else if (button == 2) {
            System.out.println("Radhe Krishna");
        }
        else {
            System.out.println("Jai Mata Di");
        }
    }
}