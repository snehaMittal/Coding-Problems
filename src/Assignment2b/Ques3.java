package Assignment2b;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int binNum = s.nextInt();
        int decNum=0 , a=1 ;

        while( binNum > 0)
        {
            decNum = decNum + ((binNum % 10 ) * a);
            a = a * 2 ;
            binNum = binNum / 10 ;
        }
        System.out.println("Decimal Number = " + decNum);


    }
}
