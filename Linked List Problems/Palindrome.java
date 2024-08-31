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

    // Method to reverse a linked list
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current;      // Move prev to the current node
            current = next;      // Move current to the next node
        }
        return prev; // Return the new head of the reversed list
    }

    // Method to check if the linked list is palindrome
    boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // Empty list or single node list is always palindrome
        }

        Node slow = head;
        Node fast = head;

        // Find the middle of the linked list using slow and fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        Node reversedSecondHalf = reverse(slow);

        // Compare the first half and the reversed second half
        Node firstHalf = head;
        while (reversedSecondHalf != null) {
            if (firstHalf.data != reversedSecondHalf.data) {
                return false; // If data does not match, it's not a palindrome
            }
            firstHalf = firstHalf.next;
            reversedSecondHalf = reversedSecondHalf.next;
        }

        return true; // If all elements match, it's a palindrome
    }
}

public class Palindrome {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(1);

        System.out.println("Is the linked list palindrome? " + list.isPalindrome());
    }
}
