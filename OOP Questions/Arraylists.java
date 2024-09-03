import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
class Arraylists {
    public static void main(String[] args) {
        
         //String | Integer | Float | Boolean -> 'Types of Lists = only object-type and not primitive typed' 
        //Syntax or Format:
        //Arraylist <list-type> list_name = new Arraylist <List_type> ();

         ArrayList <Integer> list = new ArrayList<Integer>();

        //adding new elements in the arraylist
         list.add(25);
         list.add(50);
         list.add(75);
         list.add(100);
         System.out.println(list);
        
         //get elements from the arraylist
         int element = list.get(2);
         System.out.println(element);

         //add new elements in between or middle
         list.add(1, 55);
         System.out.println(list);

         //set elements
         list.set(0, 30);
         System.out.println(list);

         //delete elements
         list.remove(1);
         System.out.println(list);

         //size
         int size = list.set(element, null);
         System.out.println(size);

         //loops
         for (int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
         }
         System.out.println();

         //sorting
         Collections.sort(list);
         System.out.println(list);

    }
}