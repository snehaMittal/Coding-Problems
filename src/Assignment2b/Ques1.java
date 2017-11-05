package Assignment2b;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = s.nextInt();
        int i , sum=0 , product=1 ;

        System.out.println("CHOOSE ONE OPTION !!! \n PRESS ");
        System.out.println("1. To find the sum ");
        System.out.println("2. To find the product");

        int option = s.nextInt();

        if( option == 1)
        {
            i = 1 ;
            while(i <= number)
            {
                sum = sum + i;
                i++ ;
            }
            System.out.println("Sum = " + sum);

        }
        else if( option == 2)
        {
            i = 1 ;
            while(i <= number)
            {
                product = product * i ;
                i++ ;
            }
            System.out.println("Product = " + product);
        }
        else
            System.out.println("-1");

    }
}
