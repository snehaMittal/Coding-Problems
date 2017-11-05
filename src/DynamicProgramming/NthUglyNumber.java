package DynamicProgramming;

/**
 * Created by Sneha on 26-09-2017.
 */
public class NthUglyNumber {

    public static void main(String[] args) {
        System.out.println(nthUglyNo(8));
    }

    private static int nthUglyNo(int a) {
        int arr[] = new int[a];
        int i2 = 0 , i3 = 0 , i5 = 0 ;
        int next_multiple_of_2 = 2 , next_multiple_of_3 = 3 , next_multiple_of_5 = 5 ;
        int next_ugly = 1 ;
        arr[0] = 1;

        for (int i=1 ; i<arr.length ; i++){
            next_ugly = Math.min(next_multiple_of_2 , Math.min(next_multiple_of_3 , next_multiple_of_5));
            arr[i] = next_ugly ;
            if (next_ugly == next_multiple_of_2){
                i2 ++ ;
                next_multiple_of_2 = arr[i2]*2 ;
            }
            if (next_ugly == next_multiple_of_3){
                i3 ++ ;
                next_multiple_of_3 = arr[i3]*3 ;
            }
            if (next_ugly == next_multiple_of_5){
                i5 ++ ;
                next_multiple_of_5 = arr[i5]*5 ;
            }

        }

        return arr[arr.length-1];
    }
}
