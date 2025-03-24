package com.br.javaPrractise.collectionMethods.Graphs;

import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;


public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex){
        if(adjList.get(vertex)==null){
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String Vertex1,String Vertex2){
        if(adjList.get(Vertex1)!=null && adjList.get(Vertex2)!=null){
            adjList.get(Vertex1).add(Vertex2);
            adjList.get(Vertex2).add(Vertex1);
            return true;
            }
        return false;
    }

    public boolean removeEdge(String Vertex1,String Vertex2){
        if(adjList.get(Vertex1)!=null && adjList.get(Vertex2)!=null){
            adjList.get(Vertex1).remove(Vertex2);
            adjList.get(Vertex2).remove(Vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(adjList.get(vertex)==null){
            return false;
        }
        for(String ott:adjList.get(vertex)){
            adjList.get(ott).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }


}