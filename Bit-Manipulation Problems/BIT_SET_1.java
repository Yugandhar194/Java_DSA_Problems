import java.util.Scanner;
 
public class BIT_SET_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
      
        //Set Bits
       
        int n = 5;      // (0101)2
        int pos = 1;        
        int bitMask = 1 << pos;     //1 << 1 = 0010
        int newNumber = bitMask | n;    
        {
            System.out.println(newNumber);      //5(10) | 2(10)
        }
        if ((bitMask | n ) == 0) {          //0010 | 0101
            System.out.println("Bit was ZERO");
        }else {
                System.out.println("Bit was ONE");
            }
        }
    }