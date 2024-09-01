import java.util.Scanner;

public class Update_Bit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       
        //Update Bits
        // oper 1: set , oper 2: clear

        int  n = 5;     // (0101)2
        int pos = 1;
        int bitMask = 1 << pos;
        int oper = sc.nextInt();

        if (oper == 1) {
            //Set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //Clear
            int newBitMask = ~(bitMask);
            int newNumber = (newBitMask & n);
            System.out.println(newNumber);
        }
    }
}
