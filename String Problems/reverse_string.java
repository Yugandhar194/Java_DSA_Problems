import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Reverse a string in Java
        StringBuffer sb = new StringBuffer("Yugandhar");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;             //(9 - 0 - 1)

            char frontChar = sb.charAt(front);
            char backChar  = sb.charAt(back);
            
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
