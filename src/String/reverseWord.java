package String;

import java.util.Scanner;

/**
 * Created by Sneha on 17-06-2017.
 */
public class reverseWord {

    public static String reverseEachWord(String input) {

        String str = "";
        int d=0 , c ;
        for(int i=0 ; i<input.length() ; i++)
        {
            if( input.charAt(i) == ' ')
            {
                c = i ;
                for( int j=c-1 ; j>=d ; j--)
                {
                    str = str + input.substring(j , j+1);

                }
                str = str + " ";
                d = i +1 ;

            }
        }
        for(int i=input.length()-1 ; i>=d ; i--)
        {
            str = str + input.substring( i , i+1);
        }

        return str;
    }

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
            System.out.println( reverseEachWord(str) );
    }
}
