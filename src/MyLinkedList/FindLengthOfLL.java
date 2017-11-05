package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 13-07-2017.
 */
public class FindLengthOfLL {
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

    public static int length(Node<Integer> head)
    {
        int count=0 ;
        while(head != null)
        {
            head = head.next;
            count++ ;
        }
        return count ;

    }

    public static void main(String[] args) {
        Node head = create_list();
        System.out.println(length(head));
    }
}
