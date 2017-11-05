package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sneha on 22-07-2017.
 */
public class Reverse {

    public static void reverse(Queue<Integer> q){
//        int[] arr = new int[q.size()];
//        for (int i=0 ; !q.isEmpty() ; i++){
//            arr[i] = q.remove();
//        }
//        for (int i=q.size()-1 ; i>=0 ; i--){
//            q.add(arr[i]);
//        }

        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()){
            stack.push(q.remove());
        }
        while (!stack.isEmpty()){
            q.add(stack.pop());
        }
    }
    public static void print(Queue queue){
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=0 ; i<n ; i++){
            queue.add(i);
        }
        reverse(queue);
        print(queue);
    }
}
