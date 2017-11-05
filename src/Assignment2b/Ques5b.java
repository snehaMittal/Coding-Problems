package Assignment2b;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques5b {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        double result = Math.sqrt(num);

        System.out.println("Enter the accuracy");
        int n = s.nextInt();

        int i , a=1 ;

        for(i=0 ; i<n ; i++)
        {
            a = a * 10 ;
        }
        result = result * a ;
        result = (int)(result);
        result = result / a ;

        System.out.println("Answer = " + result);
    }
}
