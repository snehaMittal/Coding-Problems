package Assignment3;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Decimal Number");
        int num = s.nextInt();
        int[] arr = new int[50];
        int rem ,i=0;
        while( num > 0 )
        {
         arr[i] = num % 2 ;
         num = num /2;
         i++;
        }
        int variable = --i ;
        for ( i=variable ; i>=0 ; i--)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
