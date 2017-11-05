package Assignment2a;

import java.util.Scanner;

/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int i , ans=1 ;

        for(i=0 ; i<n ; i++)
        {
            ans = ans * x ;
        }
        System.out.println("Answer : " + ans);
    }
}
