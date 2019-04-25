package com.model;

import java.util.ArrayList;
import java.util.List;

public class Graph_Node_Factory {

    Integer row,col;
    List<Graph_Node> session_graph_nodes;
    Integer dirX[] = {1,-1,0,0};
    Integer dirY[] = {0,0,1,-1};
    //WeightedGraphMatrix cur_graph;
    public Graph_Node_Factory(){
        session_graph_nodes = new ArrayList<>();
    }
    public List<Graph_Node> makeGraphNodes(WeightedGraphMatrix matrix){
        List<Graph_Node> nodes = new ArrayList<>();
        //Global unchanged data
        row = matrix.getRow();
        col = matrix.getCol();

        //Global unchanged data
        for(int i = 0; i < matrix.getRow(); i++){
            for(int j = 0; j < matrix.getCol(); j++){
                ///Value & Pos Update
                Graph_Node node = new Graph_Node(matrix.getGraph().get(i).get(j),i,j);
                ///Neighbour
                List<Graph_Node> neigbours = new ArrayList<>();
                for(int indx = 0; indx < 4; indx++){
                    Integer _nx = i + dirX[indx];
                    Integer _ny = j + dirY[indx];
                    if(boundaryIn(_nx,_ny ) && matrix.getGraph().get(i).get(j) > matrix.getGraph().get(_nx).get(_ny)){
                        neigbours.add(new Graph_Node(matrix.getGraph().get(_nx).get(_ny),_nx,_ny));
                    }
                }
                node.setNeighbours(neigbours);
                ///Adding to List
                nodes.add(node);
            }
        }
        session_graph_nodes = nodes;
        return nodes;
    }

    public List<Graph_Node> getListofNodes(){
        return session_graph_nodes;
    }

    public Boolean boundaryIn(Integer _x,Integer _y){
        return _x >= 0 && _x < this.row && _y >= 0 && _y < this.col;
    }
}