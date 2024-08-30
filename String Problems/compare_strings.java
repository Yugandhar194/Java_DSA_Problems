import java.util.Scanner;

public class compare_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Compare the two given strings


        String name1 = "YUGANDHAR";
        String name2 = "YUGANDHAR";

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are EQUAL");
        }    else {
                System.out.println("Strings are NOT EQUAL");
        }
    }
}
