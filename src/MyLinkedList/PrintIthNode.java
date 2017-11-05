package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 13-07-2017.
 */
public class PrintIthNode {
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

    public static void printIth(Node<Integer> head, int i){
        int count=1;
        while (head != null) {
            if (count == i)
            {
                System.out.println(head.data);
                break;
            }
            head = head.next;
            count++ ;
        }
        if (count > i)
        {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node head = create_list();
        int pos = s.nextInt();
        printIth(head , pos);
    }
}
