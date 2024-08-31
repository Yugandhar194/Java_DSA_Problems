class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    // Method to add a new node to the end of the linked list
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to detect loop in a linked list
    boolean hasLoop() {
        if (head == null || head.next == null) {
            return false; // Empty list or single node list cannot have a loop
        }

        Node slow = head;
        Node fast = head.next;

        // Move slow pointer by one step and fast pointer by two steps
        // If there's a loop, they will eventually meet
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Loop detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No loop detected
    }
}

public class LoopLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(6);
        list.append(5);
        list.append(4);

        // Create a loop for testing
        list.head.next.next.next.next.next = list.head.next;

        System.out.println("Does the linked list have a loop? " + list.hasLoop());
    }
}
