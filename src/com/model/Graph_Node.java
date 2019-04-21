package com.model;

public class Graph_Node {
    Integer xPos;
    Integer yPos;
    Integer val;

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
}