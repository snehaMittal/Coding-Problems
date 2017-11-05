package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 17-07-2017.
 */
public class FindAnElement {
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

    public static int indexOfNIter(Node<Integer> head, int n){
        int count = 0;
        while (head != null){
            if (head.data == n){
                return count;
            }
            head = head.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = create_list();
        System.out.println(indexOfNIter(head , 4));
    }

}
