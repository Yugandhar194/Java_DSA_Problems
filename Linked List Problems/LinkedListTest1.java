// Node class representing each element of the linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize a node with given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class containing methods to manipulate the linked list
class LinkedList {
    Node head;

    // Method to insert a new node at the beginning of the linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to print the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
        
    }

    // Method to reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}

// Main class to execute the program
public class LinkedListTest1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original linked list:");
        list.display();

        list.reverse();

        System.out.println("Reversed linked list:");
        list.display();
    }
}
