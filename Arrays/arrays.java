import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[4];
        marks[0] = 97; //phy
        marks[1] = 98; //chem
        marks[2] = 95; //maths
        marks[3] = 92; //bio
        
        System.out.println(marks);      //Garbage value as output

        for (int i=0; i<4; i++) {
            System.out.println(marks[i]);
        }
    }
}
