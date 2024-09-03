import java.util.Scanner;
//Single Inheritance

class Shape {
    Scanner sc = new Scanner(System.in);
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 //Hirearchial Inheritance

 class Triangle extends Shape {
    public void area(int h, int b) {
        h = sc.nextInt();
        b = sc.nextInt();
        System.out.println((1/2)*b*h);
    }  
 }
 //Multi-Level Inheritance

 class EquilateralTriangle extends Triangle {
    int side;
 }
 
 //Hybrid Inheritance
 class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
 }
  