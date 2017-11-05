package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 24-06-2017.
 */
public class printSubquence {

    public static void subseq(String input , String result)
    {
        if (input.length() == 0)
        {
            System.out.println(result);
            return;
        }
        subseq(input.substring(1) , result);
        subseq(input.substring(1) , result+input.charAt(0));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        subseq(str,"");
    }
}
