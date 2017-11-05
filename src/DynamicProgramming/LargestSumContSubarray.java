package DynamicProgramming;

/**
 * Created by Sneha on 26-09-2017.
 */
public class LargestSumContSubarray {

    public static void main(String[] args) {
        int arr[] = {-2, -3, -4, -1, -2, -1, -5, -3};
        System.out.println(LSCSubarrayNeg(arr));
        System.out.println(LSCSubarray(arr));
    }

    private static int LSCSubarray(int[] arr) {

        int curr_max = 0 ;
        int final_max = 0 ;

        for (int i=0 ; i<arr.length ; i++){
            curr_max = curr_max + arr[i];

            if (curr_max > final_max)
                final_max = curr_max ;
            if (curr_max < 0)
                curr_max = 0 ;
        }

        return final_max ;
    }


    private static int LSCSubarrayNeg(int[] arr) {

        int curr_max = arr[0] ;
        int final_max = arr[0] ;

        for (int i=1 ; i<arr.length ; i++){
            curr_max = Math.max(arr[i] , arr[i] + curr_max);
            final_max = Math.max(curr_max , final_max);
        }

        return final_max ;
    }
}
