package Stacks;

import java.util.Stack;

/**
 * Created by Sneha on 21-07-2017.
 */
public class InfixToPostfix {

    public static int prec(char c){
        switch(c){
            case '+' :
            case '-' :
                return 1 ;
            case '*' :
            case '/' :
                return 2 ;
            case '^' :
                return 3 ;
        }
        return -1 ;
    }

    public static String infixToPostfix(String input){
        String str = "" ;
        Stack<Character> stack = new Stack<>();

        for (int i=0 ; i<input.length() ; i++){
            char ch = input.charAt(i) ;

            if (Character.isLetterOrDigit(ch)){
                str = str + ch ;
                System.out.println(str);
            }
            else if (ch == '('){
                stack.push(ch);
            }
            else if (ch == ')'){
                while ( !stack.isEmpty() && stack.peek() != '(')
                    str = str + stack.pop();

                if ( !stack.isEmpty() && stack.peek() != '(')
                    return "invalid expression" ;
                 else
                    stack.pop();
            }
            else {
                while (!stack.isEmpty() && prec(ch) <= prec(stack.peek())){
                    str = str + stack.pop() ;

                 stack.push(ch);
                }
            }

            while (!stack.isEmpty()){
                str = str + stack.pop() ;
            }
        }
        return str ;
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
}
