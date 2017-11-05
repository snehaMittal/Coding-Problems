package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 16-07-2017.
 */
public class AppendLastNToFirst {
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
    public static Node<Integer> append(Node<Integer> root, int n){
        Node temp=root , head=null ;
        int count = length(root , 0) ;
        int i = count - n , j=1;

        while (temp.next != null){
            if (j == i){
                head = temp.next;
                temp.next = null ;
                temp = head ;
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = root ;
                break;
            }
            j++;
            temp = temp.next;
        }
        return head ;
    }

    public static void main(String[] args) {
        Node head = create_list();
        head = append(head , 3);
        print_recurssion(head);
    }
}
