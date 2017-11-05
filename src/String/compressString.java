package String;

import java.util.Scanner;

/**
 * Created by Sneha on 20-06-2017.
 */
public class compressString {

    public static String compress(String inputString)
    {
        String str = "";
        int i=0 ;
        while( i < inputString.length())
        {
            char c = inputString.charAt(i) ;
            int count=0 ;
            int j=i ;
            while( j < inputString.length() && inputString.charAt(j) == c)
            {
                count++ ;
                j++ ;
            }
            if( count == 1)
            {
                str = str + c ;
            }
            else
            {
                str = str + c + count ;
            }
            i = i + count ;
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(compress(str));
    }
}
