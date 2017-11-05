package String;

import java.util.Scanner;

/**
 * Created by Sneha on 17-06-2017.
 */
public class stringPalindrome {

    public static boolean checkPalindrome(String str) {
        int c = str.length();
        for(int i=0 ; i<str.length()/2 ; i++)
        {
            if(str.charAt(i) == str.charAt(c-1))
            {
                c--;
            }
            else
                return false;
        }
        return true;
    }

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
            System.out.println(checkPalindrome(str));

    }
}
