package Assignment2b;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int decNum = s.nextInt();
        int a=1 , initial=0 , ans=0;
        while ( decNum > 0)
        {
            int rem = decNum % 2 ;
            initial = (initial*10)+rem;
            decNum = decNum/2;
        }
        while(initial>0)
        {
            ans = (ans*10) + (initial%10);
            initial = initial/10 ;

        }
        System.out.println(ans);
    }
}
