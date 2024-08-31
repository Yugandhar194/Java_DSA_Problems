import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
       
        LinkedList <String> list = new LinkedList<String>();    //created object of linked-list

        //add new elements at beginning or at ending
        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addLast("List");
        list.addFirst("This");
        System.out.println(list);

        //Number of elements in the list
        System.out.println(list.size());

       //Printing entire list
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        //removing elements from the list
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }    
}