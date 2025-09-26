package LinkedList;
import java.util.LinkedList;
// Link list node
class Node{
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class linkedList2 {
    //Find until next is NULL
    //when next has NULL attach the new Node
    public static void main(String[] args) {
        Node head = new Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);
        printList(head);
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public Node insertAtEnd(Node head,int x){
        if(head == null){
            return new Node(x);
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node new_Node = new Node(8);
        temp.next = new_Node;
        return head;
    }
}
// insert after a given node
// insert at the beginning
// delete at the beginning
// delete a given node
