package GraphQues;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Sneha on 25-09-2017.
 */
public class RoadsAndLibrary {

    static Set<Integer> hashSet = new HashSet<>();
    static Graph graph = new Graph();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            for(int a1 = 0; a1 < m; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();

                if (!hashSet.contains(city_1)){
                    hashSet.add(city_1);
                    graph.addVertex(city_1);
                }
                if (!hashSet.contains(city_2)){
                    hashSet.add(city_2);
                    graph.addVertex(city_2);
                }
                graph.addEdge(city_1,city_2);
            }


            if (x < y){
                System.out.println(n*x);
                return;
            }


        }
    }
}

class Graph {

    ArrayList<Vertex> verticesList;

    Graph() {
        this.verticesList = new ArrayList<>();
    }

    boolean addVertex(Integer name) {
        Vertex v = getVertex(name);
        if (v != null) {
            return false;
        }
        verticesList.add(new Vertex(name));
        return true;
    }

    private Vertex getVertex(Integer name) {
        for (Vertex currentVertex : this.verticesList) {
            if (currentVertex.name.equals(name)) {
                return currentVertex;
            }
        }
        return null;
    }

    public boolean addEdge(Integer name1, Integer name2) {
        Vertex v1 = getVertex(name1);
        Vertex v2 = getVertex(name2);
        if (v1 == null || v2 == null) {
            return false;
        }
        if (areAdjacent(v1, v2)) {
            return false;
        }
        Edge newEdge = new Edge(v1, v2);
        v1.addEdge(newEdge);
        v2.addEdge(newEdge);
        return true;
    }

    private boolean areAdjacent(Vertex v1, Vertex v2) {
        if (v1.getAdjacentVertices().contains(v2)) {
            return true;
        }
        return false;
    }

    //
    // addEdge(String name1, String name2, int wight){
    //
    // }

    public boolean removeEdge(Integer name1, Integer name2) {
        Vertex v1 = getVertex(name1);
        Vertex v2 = getVertex(name2);
        if (v1 == null || v2 == null) {
            return false;
        }
        if (!areAdjacent(v1, v2)) {
            return false;
        }
        v1.removeEdge(v2);
        v2.removeEdge(v1);
        return true;

    }

    boolean areConnected(Integer name1, Integer name2) {
        Vertex v1 = getVertex(name1);
        Vertex v2 = getVertex(name2);
        Set<Vertex> set = new HashSet<>();
        set.add(v1);
        return areVerticesConnected(v1, v2, set);
    }

    boolean areVerticesConnected(Vertex src, Vertex dst, Set<Vertex> set) {
        if (areAdjacent(src, dst)) {
            return true;
        }
        for (Vertex currentVertex : src.getAdjacentVertices()) {
            if (!set.contains(currentVertex)) {
                set.add(currentVertex);
                if (areVerticesConnected(currentVertex, dst, set)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeVertex(Integer name) {
        Vertex v = getVertex(name);
        if (v == null) {
            return false;
        }
        for (Vertex currentvertex : v.getAdjacentVertices()) {
            currentvertex.removeEdge(v);
        }
        verticesList.remove(v);
        return true;
    }

    // isVertexAvaiable() {
    //
    // }
}

class Vertex {

    Integer name;
    ArrayList<Edge> edgeList;

    Vertex(Integer name){
        this.name = name;
        edgeList = new ArrayList<>();
    }

    public void addEdge(Edge newEdge) {

        this.edgeList.add(newEdge);
    }

    public ArrayList<Vertex> getAdjacentVertices() {
        ArrayList<Vertex> list = new ArrayList<>();
        for(Edge e:edgeList){
            if(e.v1.equals(this)){
                list.add(e.v2);
            }else{
                list.add(e.v1);
            }
        }
        return list;
    }

    public void removeEdge(Vertex v) {

        for(Edge e:edgeList){
            if(e.v1.equals(v)||e.v2.equals(v)){
                edgeList.remove(v);
            }
        }
    }
}


class Edge {

    Vertex v1;
    Vertex v2;
    int weight;


    Edge(Vertex v1, Vertex v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }
    Edge(Vertex v1, Vertex v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
}
