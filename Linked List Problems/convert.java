import java.util.LinkedList;

class convert {
  public static void main(String[] args) {
    LinkedList<String> languages= new LinkedList<String>();

    // Add elements in the linked list
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    System.out.println("LinkedList: " + languages);

    // Create a new array of String type
    String[] arr = new String[languages.size()];

    // Convert LinkedList into the string array
    languages.toArray(arr);
    System.out.print("Array: ");
    for(String item:arr) {      //Key - value pair
      System.out.print(item+", ");
    }
  }
}