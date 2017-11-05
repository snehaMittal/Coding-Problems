package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 16-07-2017.
 */
public class KReverse {

    public static Node create_list()
    {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node head = null ;
        Node temp = null;

        while( data != -1)
        {
            Node newNode = new Node(data);

            if (head == null)
            {
                head = newNode;
                temp = newNode;
            }
            else
            {
                temp.next = newNode;
                temp = temp.next;
            }

            data = s.nextInt() ;
        }
        return head ;
    }

    public static void print_recurssion(Node head)
    {
        if (head == null)
        {
            return;
        }
        System.out.print(head.data+" ");
        print_recurssion(head.next);
    }

    public static int length(Node<Integer> head , int count) {
        if (head.next == null)
        {
            return count+1 ;
        }

        return length(head.next , count+1) ;
    }

    public static Node<Integer> reverse_R(Node<Integer> head){
        Node newNode ;
        if( head.next == null)
        {
            return head;
        }
        newNode = reverse_R(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        Node current = head ;
        Node prev = null ;
        Node forward = null ;
        int count=0 ;

        while (count < k && current != null){
            forward = current.next ;
            current.next = prev ;
            prev = current ;
            current = forward ;
            count++ ;
        }

        if (forward != null){
            head.next = kReverse(forward , k);
        }

        return prev ;
    }
    public static void main(String[] args) {
        Node head = create_list();
        head = kReverse(head , 4);
        print_recurssion(head);
    }
}
