package ProgrammingFundamental2;

import java.util.Scanner;

/**
 * Created by Sneha on 16-06-2017.
 */
public class fibonaciiiNumber {

    public static boolean checkMember(int n)
    {
        int c , a=0 , b=1;
        while(a <= n)
        {
            c = a + b ;
            if (a == n)
                return true ;
            else
            {

                a = b ;
                b = c ;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean ans = checkMember ( n );
        System.out.println(ans);

    }
}
