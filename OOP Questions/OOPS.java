class Student {     //Class declaration
    String name;
    int age;

    public  void printInfo() {
        System.out.println(this.name);      // 'this' keyword is used to declare (to point the object)
        System.out.println(this.age);
    }
    Student() { 
        /* When an object is created using a new keyword, then space is allocated for the variable in a heap,
         and the starting address is stored in the stack memory */
        
        this.name = name;
        this.age = age;
    }
}
public class OOPS {
    public static void main(String[] args) {        //Default Constructor
        Student s1 = new Student();
        s1.name = "Yugandhar";
        s1.age =  18;
        s1.printInfo();
    }
}
