class LinkedList {
    class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head; // Head of the list


    // Method to insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to reverse the linked list
    public void reverseList() {
        if (head == null) {
            return;
        }
        Node currNode = head;
        Node preNode = null;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        head = preNode; // Update the head to the new head of the reversed list
    }
}

public class Solution {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);



        // Display the linked list
        System.out.println("Original Linked List:");
        list.display();

        // Reverse the linked list
        list.reverseList();

        // Display the reversed linked list
        System.out.println("Reversed Linked List:");
        list.display();
    }
}
