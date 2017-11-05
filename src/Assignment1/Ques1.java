package Assignment1;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques1 {
    public static void fibonacii( int n ) {
        int a=0 , b=1 , c ;
        while( a<=n) {
            System.out.print(a + " ");
            c = a + b ;
            a = b ;
            b = c ;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        fibonacii( n );
    }

}
