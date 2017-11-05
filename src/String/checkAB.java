package String;

import java.util.Scanner;

/**
 * Created by Sneha on 08-07-2017.
 */
public class checkAB {

    public static void twoSubstrings(String str)
    {
        int i , c=10000 , f=0 ;

        if(str.length()>3)
        {
            for( i=0 ; i<str.length()-1 ; i++)
            {
                if( str.charAt(i) == 'A' && str.charAt(i+1) == 'B' )
                {
                    c = i ;
                    break ;
                }
            }
            if( c != 10000)
            {
                for( i=0 ; i<str.length() ; i++)
                {
                    if( i!=c || i!=(c-2))
                    {
                        if( str.charAt(i) == 'B' && str.charAt(i+1) == 'A' )
                            f = 1 ;
                        break ;
                    }
                }
            }
            if(f == 1)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        else
            System.out.println("no");
    }

    public static void main(String[] args) {

        twoSubstrings("BABABA");
    }
}
