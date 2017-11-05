package Stacks;

import java.util.Stack;

/**
 * Created by Sneha on 21-07-2017.
 */
public class reverse {
    public static String reverse(String input){
        Stack<Character> stack = new Stack<>();
        String str = "" ;
        for (int i=0 ; i<input.length() ; i++){
            char ch = input.charAt(i);
            stack.push(ch);
        }
        while (!stack.isEmpty()){
            str = str + stack.pop();
        }
        return str ;
    }

    public static void main(String[] args) {
        System.out.println(reverse("sneha"));
    }
}
