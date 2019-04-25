package com.model;

import java.util.List;

public class SinglePathEdge {
    Graph_Node from;
    Graph_Node to;
    Integer weight;
   // List<Graph_Node> neighbours;
    public SinglePathEdge(){

    }
    public SinglePathEdge(Graph_Node _from,Graph_Node _to){
        this.from = _from;
        this.to = _to;
        this.weight = 1;
    }
    public SinglePathEdge getSinglePathEdge(){
        return this;
    }
}