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

    // Method to find the nth node from the end and remove it
    void removeNthFromEnd(int n) {
        Node dummy = new Node(0); // Create a dummy node to handle edge cases
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;

        // Move the fast pointer ahead by n+1 positions
        for (int i = 0; i <= n; i++) {
            if (fast == null) {
                return; // If n is greater than the number of nodes, do nothing
            }
            fast = fast.next;
        }

        // Move both pointers simultaneously until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Now, slow is at the node just before the nth node from the end
        // Remove the nth node by adjusting the pointers
        slow.next = slow.next.next;
        head = dummy.next; // Update head if the first node is removed
    }

    // Method to print the linked list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original list:");
        list.printList();

        int n = 2; // Example: Remove the 2nd node from the end
        list.removeNthFromEnd(n);

        System.out.println("List after removing " + n + "th node from the end:");
        list.printList();
    }
}
