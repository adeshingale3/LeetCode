import java.util.ArrayList;
import java.util.List;


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

    public int pairSum(Node head){
        List<Integer> valArray = new ArrayList<>();
        Node curr = head;
        while(curr != null){
            valArray.add(curr.data);
            curr = curr.next;
        }
        
        int maxSum = -1;
        int left = 0;
        int right = valArray.size()-1;
        while(left < right){
            int sum = (valArray.get(left)+valArray.get(right));
            left++;
            right--;
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
    



    
}

public class Solution{
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(5);
        list.insertAtEnd(4);
        list.insertAtEnd(2);
        list.insertAtEnd(1);



        // Display the linked list
        System.out.println("Original Linked List:");
        list.display();

        // Display Odd Even list
        System.out.println("Maximum Sum");
        System.out.println(list.pairSum(list.head));
        
        
        
    }
}
