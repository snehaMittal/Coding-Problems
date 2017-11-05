package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 17-07-2017.
 */
public class FindAnElementRecursively {
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

    public static int indexOfNRec(Node<Integer> head, int n){
        return indexOfNRec(head , n , 0);
    }
    public static int indexOfNRec(Node<Integer> head, int n , int count){
        if (head == null){
            return -1;
        }
        if (head.data == n){
            return count;
        }
        return indexOfNRec(head.next , n , count+1);
    }

    public static void main(String[] args) {
        Node head = create_list();
        System.out.println(indexOfNRec(head , 3));
    }
}
