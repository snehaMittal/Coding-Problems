package GraphQues;

import java.util.LinkedList;

/**
 * Created by Sneha on 26-09-2017.
 */
public class AdjacencyListRepresentation {

    static class Graph{
        int V ;
        LinkedList<Integer> listArray[] ;

        Graph(int V){
            this.V = V ;
            listArray = new LinkedList[V];

            for (int i=0 ; i<V ; i++){
                listArray[i] = new LinkedList<>();
            }
        }
    }

    static void addVertex(Graph graph , int src , int dest){

        graph.listArray[src].addFirst(dest);
        graph.listArray[dest].addFirst(src);
    }

    static void printAdjacencyMatrix(Graph graph){
        for (int i=0 ; i<graph.V ; i++){
            System.out.print("head");
            for (int crawl : graph.listArray[i]){
                System.out.print("->" + crawl);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        addVertex(graph , 0,1);
        addVertex(graph , 0,4);
        addVertex(graph , 2,1);
        addVertex(graph , 3,1);
        addVertex(graph , 4,1);
        addVertex(graph , 4,2);
        addVertex(graph , 3,2);
        addVertex(graph , 3,4);
        printAdjacencyMatrix(graph);
    }
}
