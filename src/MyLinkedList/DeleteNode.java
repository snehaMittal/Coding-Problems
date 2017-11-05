package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 13-07-2017.
 */
public class DeleteNode {
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

    public static Node<Integer> deleteIthNode(Node<Integer> head, int i){
        if (head == null)
            return head ;

        if (i == 0)
            return head.next;

        Node temp = head;
        for (int j=0; temp!=null && j<i-1; j++)
        { temp = temp.next;}
        if (temp == null || temp.next == null)
            return head;
        Node next = temp.next.next;

        temp.next = next;

//        while( i > 1)
//        {
//            if (temp.next == null)
//                return head;
//            temp = temp.next;
//            i--;
//        }
//        if (i == 1)
//        {
//            temp.next = temp.next.next;
//        }

        return head;


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node head = create_list();
        int i = s.nextInt();
        head = deleteIthNode(head , i);
        print_recurssion(head);
    }
}
