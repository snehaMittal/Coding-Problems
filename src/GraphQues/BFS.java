package GraphQues;

import java.util.LinkedList;

/**
 * Created by Sneha on 26-09-2017.
 */
public class BFS {

    static int V ;
    static LinkedList<Integer> arrList[] ;

    BFS(int V){
        this.V = V ;
        arrList = new LinkedList[V];

        for (int i=0 ; i<V ; i++){
            arrList[i] = new LinkedList<>();
        }
    }

    static void addVertex(int src , int dest){
        arrList[src].addFirst(dest);
    }

    static void breathFS(int v){
        Boolean[] visited = new Boolean[V];
        for (int i=0 ; i<V ; i++){
            visited[i] = false ;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        visited[v] = true ;
        queue.add(v);

        while (!queue.isEmpty()){
            int s = queue.poll();
            System.out.print(s + " ");

            for (int crawl : arrList[s]){
                if (!visited[crawl]){
                    queue.add(crawl);
                    visited[crawl] = true ;
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(4);
        addVertex(0,1);
        addVertex(0,2);
        addVertex(1,2);
        addVertex(2,0);
        addVertex(2,3);
        addVertex(3,3);
        breathFS(2);
    }


}
