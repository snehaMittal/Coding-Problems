package DynamicProgramming;

import java.util.Scanner;

/**
 * Created by Sneha on 17-08-2017.
 */
public class WaysToMakeCoinChange {

    public static int countWaysToMakeChange(int denominations[], int value){
        int[][] answer = new int[denominations.length][value+1];
        for (int i=0 ; i<answer.length ; i++){
            answer[i][0] = 1 ;
        }
        for (int i=0 ; i<answer.length ; i++){
            for (int j=1 ; j<answer[0].length ; j++){
                if (i == 0)
                    answer[i][j] = 1;
                else if (j >= denominations[i])
                    answer[i][j] = answer[i-1][j] + answer[i][j-denominations[i]];
                else
                    answer[i][j] = answer[i-1][j];
            }
        }
        return answer[answer.length-1][answer[0].length-1];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
        int arr[] = {1,2,3};
        System.out.println(countWaysToMakeChange(arr , 4));
    }
}
