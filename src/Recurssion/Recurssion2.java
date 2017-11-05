package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 22-06-2017.
 */
public class Recurssion2 {

    public static String replaceCharacter(String input, char c1, char c2)
    {

        int index = input.indexOf(c1);
        if (index == -1)
        {
            return input ;
        }
        return input.substring(0,index) + c2 + replaceCharacter(input.substring(index+1 , input.length()) , c1 , c2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char c1 = s.next().charAt(0);
        char c2 = s.next().charAt(0);
        System.out.println(replaceCharacter(str , c1 , c2));
    }
}
