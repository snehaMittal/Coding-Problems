package Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sneha on 23-07-2017.
 */
public class StockSpan {

    public static int[] stockSpan(int[] price){
        int ans[] = new int[price.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(price[0]);
        ans[0] = 1;


        for (int i=1 ; i<price.length ; i++){
            int count = 1 ;

            while (!stack.isEmpty() && stack.peek() < price[i]){
                count++ ;
                stack.pop();
            }
            int t=0 ;
            for (int j=i-count+1 ; t<count ; j++){
                stack.push(price[j]);
                t++ ;
            }
            ans[i] = count ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++){
            arr[i] = s.nextInt();
        }
        int[] result = stockSpan(arr);

        for (int i=0 ; i<result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
}
