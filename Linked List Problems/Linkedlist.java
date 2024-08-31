// Linked list implementation in Java

class LinkedList {
    // Creating a head node
    Node head;
  
    static class Node {
      int value;
      Node last;
  
      Node(int d) {
        value = d;
        last = null;
      }
    }
  
    public static void main(String[] args) {
      LinkedList linkedList = new LinkedList();
  
      // Assign value values
      linkedList.head = new Node(1);
      Node second = new Node(2);
      Node third = new Node(3);
  
      // Connect nodess
      linkedList.head.last = second;
      second.last = third;
  
      // printing node-value
      while (linkedList.head != null) {
        System.out.print(linkedList.head.value + " -> ");
        linkedList.head = linkedList.head.last;     //printing one node after other
      }
    }
  }