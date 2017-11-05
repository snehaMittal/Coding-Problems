package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 14-07-2017.
 */
public class MidPointOfLL {
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
// changedfunction
    public static int printMiddel(Node<Integer> head){
//        Node<Integer> temp1=head;
//        Node<Integer> temp2 = head;
//        while (temp1 != null && temp1.next != null)
//        {
//            temp2=temp2.next;
//            temp1 = temp1.next.next;
//        }
//
//        return temp2.data;
        int count = 0;
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
        return head.data;
    }
    public static void main(String[] args) {
        Node head = create_list();
        System.out.println(printMiddel(head));
    }
}
