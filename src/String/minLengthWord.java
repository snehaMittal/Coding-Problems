package String;

import java.util.Scanner;

/**
 * Created by Sneha on 18-06-2017.
 */
public class minLengthWord {

    public static String minLengthWord(String input)
    {
        String str = "" ;
        int count=Integer.MAX_VALUE , a=0;
        int d=0 , c ;
        for(int i=0 ; i<input.length() ; i++)
        {
            if( input.charAt(i) == ' ')
            {
                c = i ;
                a = 0 ;
                for( int j=c-1 ; j>=d ; j--)
                {
                    a = a + 1 ;

                }
                if ( a<count )
                {
                    str = "";
                    for( int j=d ; j<i ; j++)
                    {
                        str = str + input.substring(j , j+1);
                        count = a ;

                    }
                }
                d = i +1 ;

            }
        }
        return str ;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println( minLengthWord(input));
    }
}
