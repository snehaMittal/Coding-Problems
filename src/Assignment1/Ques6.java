package Assignment1;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int a = 1;

        for(i=1; i<n/2 ; i++)
        {
            if(a > n)
            {
                a = a / 2;
                break;
            }

            a = a * 2;

        }
        System.out.println(a);
    }
}
