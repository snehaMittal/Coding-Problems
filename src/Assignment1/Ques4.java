package Assignment1;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum=0 , a ;
        int n = num ;
        while ( num != 0)
        {
            a = num % 10 ;
            sum = sum + (a*a*a);
            num = num / 10 ;
        }
        if( sum == n)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");

    }
}
