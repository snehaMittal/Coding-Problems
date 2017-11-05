package Assignment1;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques5b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, j, k;
        int n = s.nextInt();
        for (i = 0; i < n; i++) {
            j = 0;
            while (j < n - i - 1) {
                System.out.print(" ");
                j++;
            }

            j = 1;
            k = i * 2 + 1;

            while (j <= k) {
                if (j == 1 || j == k) {
                    System.out.print("1");
                } else if (j % 2 == 0) {
                    System.out.print(" ");
                } else
                    System.out.print("0");

                j++;

            }
            System.out.println(" ");


        }
    }
}
