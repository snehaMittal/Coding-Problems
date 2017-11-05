package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 17-07-2017.
 */
public class NthNodeFromLast {
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
    public static int length(Node<Integer> head , int count) {
        if (head.next == null)
        {
            return count+1 ;
        }

        return length(head.next , count+1) ;
    }
    public static Node<Integer> nthNodeFromLastIter(Node<Integer> head, int n){

        int count = length(head , 0);
        int i = count-n;
        if (i <= 0){
            return null;
        }
        count = 1 ;
        while (head != null) {
            if (count == i)
            {
                head.next = null;
                break;
            }
            head = head.next;
            count++ ;
        }
        return head ;
    }

    public static void main(String[] args) {
        Node head = create_list();
        head = nthNodeFromLastIter(head , 3);
        print_recurssion(head);
    }
}
