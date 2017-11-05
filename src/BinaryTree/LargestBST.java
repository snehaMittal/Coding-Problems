package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 03-08-2017.
 */
public class LargestBST {

    static Scanner s = new Scanner(System.in);
    public static node<Integer> createTree(){
        int data = s.nextInt();
        if (data == -1){
            return null ;
        }
        node<Integer> root = new node<>(data);
        root.left = createTree();
        root.right = createTree();
        return root ;
    }

    static int anssize = 0;
    static int ans = -1 ;
    public static MinMax largest(node<Integer> root) {
        if (root == null) {
            return new MinMax();
        }
        MinMax leftMinMax = largest(root.left);
        MinMax rightMinMax =largest(root.right);

        MinMax m = new MinMax();
        if(leftMinMax.isBST == false || rightMinMax.isBST == false || (leftMinMax.max > root.data || rightMinMax.min <= root.data)){
            m.isBST = false;
            m.size = Math.max(leftMinMax.size, rightMinMax.size);
            return m;
        }
        m.isBST = true;
        m.size = Math.max(leftMinMax.size,rightMinMax.size)+ 1;
        m.min = root.left != null ? leftMinMax.min : root.data;
        m.max = root.right != null ? rightMinMax.max : root.data;
        if (m.size > anssize){
            anssize = m.size;
            ans = root.data ;
        }
        return m;
    }
    public static int largestBSTSubtree(node<Integer> root){
        largest(root);
        return ans ;
    }
    public static void main(String[] args) {
        node<Integer> root = createTree();
        System.out.println(largestBSTSubtree(root));
    }

}
class MinMax{
    int min;
    int max;
    boolean isBST;
    int size ;

    MinMax(){
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        isBST = true;
        size = 0;
    }
}
