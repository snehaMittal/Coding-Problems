package Stacks;

import java.util.Stack;

/**
 * Created by Sneha on 22-07-2017.
 */
public class RedundantBrackets {

    public static boolean checkRedundantBrackets(String input) {

        Stack<Character> stack = new Stack<>();
        for (int i=0 ; i<input.length() ; i++){
            char ch = input.charAt(i);
            if (input.charAt(i) == '(' && input.charAt(i+1) == ')')
                return true ;
            if (ch == ')'){
                char c = stack.peek();
                stack.pop();
                if (c == '(' && stack.peek() == '(')
                    return true;
                else {
                    while (stack.peek() != '('){
                        c = stack.peek();
                        stack.pop();
                    }
                }
            }
            else
                stack.push(ch);
        }
        return false ;
    }

    public static void main(String[] args) {
        String str = "(((a+(b))+(c+d)))";
        System.out.println(checkRedundantBrackets(str));

    }
}
