package Assignment2a;

import java.util.Scanner;

/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int odd=0 , even=0 , i ;
        int n = s.nextInt();

        for(i=0 ; i<100 ; i++)
        {
            if(n<=0)
                break;
            if(i%2 == 0)
            {
                odd = odd + (n%10);
                n = n/10 ;
            }
            else
            {
                even = even + (n%10);
                n = n/10 ;
            }
        }
        System.out.println("sum of odd place digits = " + odd);
        System.out.println("sum of even place digits = " + even);

    }
}
