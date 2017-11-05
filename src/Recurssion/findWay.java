package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 24-06-2017.
 */
public class findWay {

    public static int findWays(int n )
    {
        return find(n+1);
    }

    public static int find(int n)
    {
        if (n <= 1)
            return n;
        int res = 0;
        for (int i = 1; i<=3 && i<=n; i++)
            res += find(n-i);
        return res ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(findWays(n));
    }
}
