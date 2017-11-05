package String;

import java.util.Scanner;

/**
 * Created by Sneha on 17-06-2017.
 */
public class countWord {

    public static int countWords(String str)
    {
        int count=0 ;

        for(int i=0 ; i<str.length() ; i++)
        {
            if( str.charAt(i) == ' ')
                count++;
        }
        return count+1;
    }

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
            System.out.println( countWords(str) );

    }
}
