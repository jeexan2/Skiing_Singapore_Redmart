package com.business_logic;

import com.model.*;

import java.util.ArrayList;
import java.util.List;

public class Finding_All_Path{
    WeightedGraphMatrix matrix;
    Paths paths;
    List<Graph_Node> nodes = new ArrayList<>();
    //For Direction
    Integer dirX[] = {-1,1};
    Integer dirY[] = {-1,1};
    //For Direction

    public Finding_All_Path(){

    }
    public Finding_All_Path(WeightedGraphMatrix _matrix){
        matrix = _matrix;
        //paths = new Paths();
    }

    private void dfs(){

    }

    public List<Graph_Node> matrixToGraph(){
        nodes.clear();

        for(int i = 0; i < matrix.getRow(); i++){
            for(int j = 0; j < matrix.getCol();j++){
                Graph_Node node = new Graph_Node(matrix.graphValue(i,j),i,j);
                nodes.add(node);
            }
        }
        return nodes;
    }
}