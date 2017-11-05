package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 27-07-2017.
 */
public class GivenArrayFormBalancedBst {

    public static void print(node<Integer> root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }

    public static node<Integer> constructBST(int[] arr){
        return constructBST(arr , 0 , arr.length-1);
    }
    public static node<Integer> constructBST(int[] arr , int min , int max){
        if (min > max){
            return null ;
        }
        int mid = min + ((max - min) /2 );
        node<Integer> newNode = new node<>(arr[mid]);
        newNode.right = constructBST(arr , mid+1 , max);
        newNode.left = constructBST(arr , min , mid-1);
        return newNode ;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        node<Integer> ans = constructBST(arr);
        print(ans);
    }

}
