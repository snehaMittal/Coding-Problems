package Stacks;

import java.util.Stack;

/**
 * Created by Sneha on 21-07-2017.
 */
public class Reverse_Recursion {

    static  Stack<Character> stack = new Stack<>();
    public static String reverse(String input){

        if (input.length() == 0){
            return "" ;
        }
        stack.push(input.charAt(0));
        String str = reverse(input.substring(1)) + stack.pop() ;
        return str;
    }

    public static void main(String[] args) {
        System.out.println(reverse("sneha"));
    }
}
