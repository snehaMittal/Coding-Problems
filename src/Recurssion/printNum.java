package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 20-06-2017.
 */
public class printNum {

    public static void print(int num)
    {
        if(num == 1)
        {
            System.out.println(num + " ");
            return;
        }
        print(--num);
        System.out.print(num+1 + " ");
        return;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print(n);
    }
}
