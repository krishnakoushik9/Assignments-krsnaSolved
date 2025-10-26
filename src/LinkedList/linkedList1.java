//package LinkedList; // Java program to find Nth node from end of linked list
//
//// Link list node
//public class Node {
//    int data;
//    Node next;
//
//    Node(int new_data) {
//        data = new_data;
//        next = null;
//    }
//}
//
//public class linkedList1 {
//    static int nthFromEnd(Node head, int N) {
//        Node firstPerson = head;
//        Node secondPerson = head;
//
//        for (int i = 0; i < N; i++) {g
//            if (firstPerson == null) {
//                return -1;
//            }
//            firstPerson = firstPerson.next;
//        }
//        while (firstPerson != null) {
//            firstPerson = firstPerson.next;
//            secondPerson = secondPerson.next;
//        }
//
//        return secondPerson != null ? secondPerson.data : -1;
//    }
//
//    public static void main(String[] args) {
//        // Create a hard-coded linked list: 35 -> 15 -> 4 -> 20
//        Node head = new Node(35);
//        head.next = new Node(15);
//        head.next.next = new Node(4);
//        head.next.next.next = new Node(20);
//
//        // Function Call to find the 4th node from end
//        System.out.println(nthFromEnd(head, 7)); // This should return -1
//    }
//}
