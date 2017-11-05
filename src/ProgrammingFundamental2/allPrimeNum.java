package ProgrammingFundamental2;

import java.util.Scanner;

/**
 * Created by Sneha on 16-06-2017.
 */
public class allPrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if( n >= 2)
            System.out.println("2 ");
        for( int i=3 ; i<=n ; i++)
        {
            int flag=0;
            int j=2;
            while(j<i)
            {
                if( i%j == 0)
                {
                    flag = 1;
                    break;
                }
                j++;
            }
            if(flag == 0)
            {
                System.out.println(i + " ");
            }

        }
    }
}
