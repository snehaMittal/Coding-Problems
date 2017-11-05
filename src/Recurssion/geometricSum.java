package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 21-06-2017.
 */
public class geometricSum {

    public static double findGeometricSum(int k)
    {
        if(k == 0)
        {
            return 1 ;
        }
        double a = Math.pow(2,k);
        return 1/a + findGeometricSum(k-1);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        System.out.println(findGeometricSum(k));
    }
}
