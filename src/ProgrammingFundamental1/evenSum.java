package ProgrammingFundamental1;

import java.util.Scanner;

/**
 * Created by Sneha on 16-06-2017.
 */
public class evenSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0 , i=1 ;
        while(i<=n)
        {
            if(i%2 == 0)
            {
                sum = sum + i;
                i = i+2 ;
            }
            else
                i++ ;
        }
        System.out.println(sum);
    }
}
