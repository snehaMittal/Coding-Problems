package Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sneha on 22-07-2017.
 */
public class ReverseUsingAnotherStack {

    static Stack s1 = new Stack();
    static Stack s2 = new Stack();

    public static void reverse(Stack s1 , Stack s2){

        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        for (int i=0 ; i<s2.size() ; i++){
            s1.push(s2.get(i));
        }
    }
    public static void print(Stack s){

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=0 ; i<n ; i++){
            int a = s.nextInt();
            s1.push(a);
        }
        reverse(s1,s2);
        print(s1);
    }

}
