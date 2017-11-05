package Assignment1;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        if( x==y && x%2==0)
            System.out.println(x+y);
        else if (x == y)
            System.out.println(x+y-1);
        else if (x>y && (x+y)%2==0)
            System.out.println(x+y);
        else
            System.out.println("No. is not there ");
    }
}
