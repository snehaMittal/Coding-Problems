package Assignment2a;

import java.util.Scanner;

/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch = s.next().charAt(0);

        if( ch>=65 && ch<=90)
        {
            System.out.println(ch + " is an uppercase letter");
        }
        else
            if( ch>=97 && ch<=122)
            {
                System.out.println(ch + " is a lower case letter");
            }
            else
                System.out.println("invalid character");




    }
}
