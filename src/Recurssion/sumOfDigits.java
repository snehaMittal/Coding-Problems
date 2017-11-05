package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 21-06-2017.
 */
public class sumOfDigits {

    public static int sumOfDigits(int input)
    {
        if (input == 0)
        {
            return 0 ;
        }
        int ans = sumOfDigits(input/10);
        return ans + input%10 ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
