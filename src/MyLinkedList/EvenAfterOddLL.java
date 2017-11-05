package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 17-07-2017.
 */
public class EvenAfterOddLL {
    public static Node create_list() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node head = null ;
        Node temp = null;

        while( data != -1) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                temp = newNode;
            }
            else {
                temp.next = newNode;
                temp = temp.next;
            }

            data = s.nextInt() ;
        }
        return head ;
    }
    public static void print_recurssion(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data+" ");
        print_recurssion(head.next);
    }

    public static Node<Integer> sortEvenOdd(Node<Integer> head){
        Node<Integer> head1=null , temp1 = head1 ;
        Node<Integer> temp = head;

        while (temp != null){
            if (temp.data.intValue() % 2 == 1){
                if (head1 == null){
                    Node newNode = new Node(temp.data);
                    head1 = newNode;
                    temp1 = head1;
                }
                else{
                    Node newNode = new Node(temp.data);
                    temp1.next = newNode ;
                    temp1 = temp1.next ;
                }
            }
            temp = temp.next ;
        }
        temp = head ;
        while (temp != null){
            if (temp.data.intValue() % 2 == 0){
                if (head1 == null){
                    Node newNode = new Node(temp.data);
                    head1 = newNode;
                    temp1 = head1;
                }
                else{
                    Node newNode = new Node(temp.data);
                    temp1.next = newNode ;
                    temp1 = temp1.next ;
                }
            }
            temp = temp.next ;
        }
        return head1;
    }
    public static void main(String[] args) {
        Node head = create_list();
        head = sortEvenOdd(head);
        print_recurssion(head);
    }
}
