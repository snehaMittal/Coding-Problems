package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 14-07-2017.
 */
public class Merge2LL {
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


    public static Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;
        Node<Integer> temp3 = null ;
        Node<Integer> head3=null ;
        if (temp1.data.compareTo(temp2.data) < 0 ) {
            head3 = temp1 ;
            temp3 = head3 ;
            temp1 = temp1.next ;
        }
        else{
            head3 = temp2 ;
            temp3 = head3 ;
            temp2 = temp2.next ;
        }

        while( temp1 != null && temp2 != null)
        {
            if (temp1.data.compareTo(temp2.data) < 0){
                temp3.next = temp1;
                temp1 = temp1.next;
                temp3 = temp3.next;
            }
            else{
                temp3.next = temp2;
                temp2 = temp2.next;
                temp3 = temp3.next ;
            }

        }
        if (temp1 == null){
            temp3.next = temp2;
        }
        else{
            temp3.next = temp1;
        }

        return head3;
    }

    public static void main(String[] args) {
        Node head1 = create_list();
        Node head2 = create_list();
//        Node<Integer> head1 = new Node<>(1);
//        head1.next = new Node<>(2);
//        head1.next.next = new Node<>(5);
//
//        Node<Integer> head2 = new Node<>(3);
//        head2.next = new Node<>(4);
//        head2.next.next = new Node<>(6);
        head1 = mergeTwoList(head1 , head2);
        print_recurssion(head1);
    }

}
