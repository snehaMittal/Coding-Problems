package Stacks;

import java.util.Stack;

/**
 * Created by Sneha on 21-07-2017.
 */
public class BalancedParenthesis {

    public static boolean balancedParenthesis(String input){

        Stack<Character> stack = new Stack<>();
        for (int i=0 ; i<input.length() ; i++){
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch) ;
            }
            else if (ch == ')'){
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop() ;
                else
                    return false ;
            }
            else if (ch == '}'){
                if (!stack.isEmpty() && stack.peek() == '{')
                    stack.pop() ;
                else
                    return false ;
            }
            else if (ch == ']'){

                if (!stack.isEmpty() && stack.peek() == '[')
                    stack.pop() ;
                else
                    return false ;
            }
        }
        if (stack.isEmpty())
            return true ;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(balancedParenthesis("{{[])}}"));
    }

}
