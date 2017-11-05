package AndroidPrac;

import java.util.Scanner;

/**
 * Created by Sneha on 19-08-2017.
 */
public class push0toend {
    public static void pushZerosAtEnd(int[] arr) {
//        int[] temp = new int[arr.length];
//        int k=0 ;
//        for (int i=0 ; i<arr.length ; i++) {
//            if( arr[i] != 0) {
//                temp[k] = arr[i];
//                k++;
//            }
//        }
//        for(int i=0 ; i<arr.length ; i++) {
//            if(i<k)
//                arr[i] = temp[i];
//            else
//                arr[i] = 0 ;
//        }
        int nzp = 0;
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[nzp];
                arr[nzp] = temp;
                nzp++;
            }
        }
    }

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for(int i=0 ; i<n ; i++) {
//            arr[i] = s.nextInt();
//        }
        int[] arr = {1,0,3,0,5,0,6};
        pushZerosAtEnd(arr);
        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
