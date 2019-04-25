package com.model;

import java.util.ArrayList;
import java.util.List;

public class Graph_Node {
    Integer xPos;
    Integer yPos;
    Integer val;
    List<Graph_Node> neighbours;

    public Graph_Node(){

    }
    public Graph_Node(Integer _val, Integer x, Integer y){
        val = _val;
        xPos = x;
        yPos = y;
    }
    public Integer getxPos(){
        return xPos;
    }
    public Integer getyPos(){
        return yPos;
    }
    public Integer getVal(){
        return val;
    }
    public void setNeighbours(List<Graph_Node> _neighbours){
        neighbours = _neighbours;
    }
    public Graph_Node getGraphNode(){
        return this;
    }


}