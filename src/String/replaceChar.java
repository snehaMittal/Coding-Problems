package String;

import java.util.Scanner;

/**
 * Created by Sneha on 17-06-2017.
 */
public class replaceChar {

    public static String replaceCharacter(String input, char c1, char c2) {

        String str = "";
        for(int i=0 ; i<input.length() ; i++)
        {
            if(input.charAt(i) == c1)
            {
                str =str + c2 ;
            }
            else
            {
                str = str + input.substring(i,(i+1));
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char c1 = s.next().charAt(0);
        char c2 = s.next().charAt(0);
        System.out.println(replaceCharacter( str , c1 , c2));
    }
}
