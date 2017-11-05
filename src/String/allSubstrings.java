package String;

import java.util.Scanner;

/**
 * Created by Sneha on 17-06-2017.
 */
public class allSubstrings {

    public static void printSubstrings(String str)
    {
        for (int i=0 ; i<str.length() ; i++)
        {
            for (int j=i ; j<str.length() ; j++)
            {
                System.out.println(str.substring(i,j+1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printSubstrings(str);
    }
}
