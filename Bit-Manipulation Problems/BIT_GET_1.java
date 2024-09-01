import java.util.Scanner;
 
public class BIT_GET_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

         //Get Bits

        int n = 5;      // (0101)2
        int pos = 3;        
        int bitMask = 1 << pos;     //1 << 2 = 1000

        if ((bitMask & n ) == 0) {          //1000 & 0101
            System.out.println("Bit was ZERO");
        }else {
                System.out.println("Bit was ONE");
            }
        }
    }