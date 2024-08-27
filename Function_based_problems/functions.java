import java.util.*;
public class functions {
    public static void printMyName(String name) //Declaring dunctions
    {
        System.out.println(name);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name);      //Calling function
    }
}
