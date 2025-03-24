package com.br.javaPrractise.collectionMethods.Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Graph myGraph = new Graph();
//        myGraph.addVertex("A");
//        myGraph.addVertex("B");
//        System.out.println("Graph before addEdge():");
//        myGraph.printGraph();
//        myGraph.addEdge("A", "B");
//        System.out.println("\nGraph after addEdge():");
//        myGraph.printGraph();
//        myGraph.removeEdge("A","B");
//        myGraph.printGraph();
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");

        System.out.println("Graph before removeVertex():");
        myGraph.printGraph();
        myGraph.removeVertex("D");
        System.out.println("\nGraph after removeVertex():");
        myGraph.printGraph();

    }
}
