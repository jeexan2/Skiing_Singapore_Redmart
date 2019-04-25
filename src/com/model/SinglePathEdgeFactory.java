package com.model;

import java.util.ArrayList;
import java.util.List;

public class SinglePathEdgeFactory {
     List<SinglePathEdge> edges;


    public SinglePathEdgeFactory(){
        edges = new ArrayList<>();
    }

    public List<SinglePathEdge> makeSinglePathEdges(Graph_Node_Factory graph_node_factory){
        List<Graph_Node> nodes = graph_node_factory.getListofNodes();
        edges = new ArrayList<>();
        for(int i = 0; i < nodes.size();i++){

        }
        return edges;
    }

    public List<SinglePathEdge> getSinglePathEdges(){
        return edges;
    }

}