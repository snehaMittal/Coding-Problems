package Assignment2a;

import java.util.Scanner;


/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1 , x2 , d ;
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        d = Math.sqrt((b*b) - (4*a*c));

        x1 = (-b+d)/(2*a) ;
        x2 = (-b-d)/(2*a) ;

        if( d == 0)
        {
            System.out.println("0");
        }
        else if( d > 0)
        {
            System.out.println("1");
        }
        else
            System.out.println("-1");
        System.out.println( Math.round(x1) + " " + Math.round(x2));
    }
}
