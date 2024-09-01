import java.util.Scanner;

public class Clear_Bit {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        //Clear Bits
        int n = 5;          //(0101)2
        int pos = 2;        //3rd bit = 2nd position: 0
        int bitMask = 1 << pos;     
        int notBitMask = ~(bitMask);

        int newNumber = (notBitMask & n);
        System.out.println(newNumber);

    }
}
