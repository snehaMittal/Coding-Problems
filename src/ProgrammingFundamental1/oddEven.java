package ProgrammingFundamental1;

import java.util.Scanner;

/**
 * Created by Sneha on 15-06-2017.
 */
public class oddEven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int odd=0 , even=0;
        int N = s.nextInt();

        while( N > 0)
        {
            int rem = N % 10 ;
            if ( rem%2 == 0)
                even = even + rem ;
            else
                odd = odd + rem ;
            N = N / 10 ;
        }
        System.out.println(even + " " + odd);
    }
}
