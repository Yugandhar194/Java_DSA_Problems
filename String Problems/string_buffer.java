import java.util.Scanner;

public class string_buffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //String buffer class in Java
        StringBuilder sb = new StringBuilder("Rohit");
        System.out.println(sb);

        //Return the char at that specific index
        System.out.println(sb.charAt(0));

        //Set the character at that specific index and replace it with the original one
        sb.setCharAt(0, 'M' );
        System.out.println(sb);

        //Delete a character in the string
        sb.delete(0, 2);

        //Add an element in the ending
        sb.append("Sharma");

        //Return the length of the string
        sb.length();
    }
}
