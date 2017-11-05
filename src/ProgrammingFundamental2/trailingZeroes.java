package ProgrammingFundamental2;

import java.util.Scanner;

/**
 * Created by Sneha on 16-06-2017.
 */
public class trailingZeroes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0 ;
        for(int i=5 ; n/i>=1 ; i=i*5)
        {
            count = count + (n/i);
        }
        System.out.println(count);
    }
}
