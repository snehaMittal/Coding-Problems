package DynamicProgramming;

/**
 * Created by Sneha on 04-08-2017.
 */
public class Staircase {

    public static long staircase(int n){
        long[] storage = new long[n+1];
        return staircase1(n , storage);
    }

    public static long staircase1(int n ,long[] arr){

        if (n == 0 || n == 1 ){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        if (arr[n]>0){
            return arr[n];
        }
        arr[n] = staircase1(n-1 , arr) + staircase1(n-2 , arr) + staircase1(n-3 , arr);
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(staircase(8));
    }
}
