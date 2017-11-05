package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 17-07-2017.
 */
public class MergeSort {
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
    public static Node<Integer> midpoint(Node<Integer> head){
        int count=0;
        Node temp=head;
        while (temp.next != null)
        {
            count++;
            temp=temp.next;
        }
        count = count / 2 ;
        temp = head;
        while (count != 0){
            temp=temp.next;
            count--;
        }
        head = temp ;
        return head;
    }
    public static Node<Integer> mergeSort(Node<Integer> head){
        if (head.next == null){
            return head;
        }
        Node mid = midpoint(head) ;
        Node half1 = mergeSort(mid.next);
        mid.next = null;
        Node half2 = mergeSort(head);
        return mergeTwoList(half1 , half2);

    }

    public static void main(String[] args) {
        Node head1 = create_list();
//        Node head2 = create_list();
//        Node<Integer> head1 = new Node<>(1);
//        head1.next = new Node<>(7);
//        head1.next.next = new Node<>(5);

//        Node<Integer> head2 = new Node<>(3);
//        head2.next = new Node<>(4);
//        head2.next.next = new Node<>(6);
        head1 = mergeSort(head1);
        print_recurssion(head1);
    }

}
