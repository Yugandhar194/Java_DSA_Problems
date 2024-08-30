import java.util.Scanner;

public class string_functions {
    public static void main(String[] args) {
        //Declaration of a string
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is : "+name);

        //Concatenation : Join two strings

        String firstName = "Sudhir";
        String lastName =  "Jyoti";
        String fullName = firstName + " " +lastName;
        System.out.println("Full name is "+fullName);

        //Return the length of string
        System.out.println("Length of the Full name is "+fullName.length());

        //Return the specific character at that respective index
        for (int i=0; i<fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }

        //Lowercase and Uppercase
        System.out.println(firstName.toLowerCase());
        System.out.println(lastName.toUpperCase());

        //ParseString method
        int number = 1234567890;
        String str = Integer.toString(number);
        System.out.println(str.length());
        
        //ParseInt method
            String str_1 = "12345";
            int number_1 = Integer.parseInt(str_1);
            System.out.println(number_1);
     
    }
}