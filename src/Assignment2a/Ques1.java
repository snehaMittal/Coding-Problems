package Assignment2a;

import java.util.Scanner;

/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        float mark1 = s.nextFloat();
        String name1 = s.next();
        float mark2 = s.nextFloat();
        String name2 = s.next();
        float mark3 = s.nextFloat();
        String name3 = s.next();

        if( mark1 > mark2 && mark3 > mark2)
        {
            System.out.println("Name of best two students :" + name1 + " " + name3);
            System.out.println("average :" + ((mark1+mark3)/2));
        }

        else
        if( mark1 > mark3 && mark2 > mark3)
        {
            System.out.println("Name of best two students :" + name1 + " " + name2);
            System.out.println("average :" + ((mark1+mark2)/2));
        }

        else
        {
            System.out.println("Name of best two students :" + name2 + " " + name3);
            System.out.println("average :" + ((mark3+mark2)/2));
        }

    }
}
