package Assignment2a;

import java.util.Scanner;

/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int revNum=0;

        while(num>0)
        {
            revNum = (revNum*10) + num%10;
            num = num/10 ;

        }
        System.out.println("Reversed Number = " + revNum);

    }
}
