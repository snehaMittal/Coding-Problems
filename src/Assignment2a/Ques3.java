package Assignment2a;

import java.util.Scanner;

/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
         float allow , hra , da , pf , t_sal;
         float basic = s.nextFloat();
         char grade = s.next().charAt(0);

         hra = 0.2f * basic ;
         da = 0.5f * basic ;
         pf = 0.11f * basic ;

         if( grade == 'A' || grade == 'a')
             allow = 1700 ;
         else if ( grade == 'B' || grade == 'b')
             allow = 1500 ;
         else
             allow = 1300 ;

         t_sal = basic + allow + hra + da - pf ;

        System.out.println(Math.round( t_sal));


    }
}
