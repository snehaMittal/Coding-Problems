package GraphQues;

import java.util.LinkedList;

/**
 * Created by Sneha on 26-09-2017.
 */
public class DFS {
    static int V ;
    static LinkedList<Integer> arrList[] ;

    DFS(int V){
        this.V = V ;
        arrList = new LinkedList[V];

        for (int i=0 ; i<V ; i++){
            arrList[i] = new LinkedList<>();
        }
    }

    static void addVertex(int src , int dest){
        arrList[src].addFirst(dest);
    }
     static void deapthFS(int i) {
        boolean visited[] = new boolean[V];
        deapthFSHelper(i , visited);
    }

    private static void deapthFSHelper(int i, boolean[] visited) {
        visited[i] = true ;
        System.out.print(i + " ");

        for (int crawl : arrList[i]){
            if (!visited[crawl]){
                deapthFSHelper(crawl , visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(4);
        addVertex(0,1);
        addVertex(0,2);
        addVertex(1,2);
        addVertex(2,3);
        addVertex(2,0);
        addVertex(3,3);
        deapthFS(2);
    }



}
