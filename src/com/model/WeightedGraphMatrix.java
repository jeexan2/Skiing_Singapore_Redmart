package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeightedGraphMatrix {
    Integer row,col;

    List<List<Integer>> weightedGraph;


    public WeightedGraphMatrix(int _row,int _col){
        row = _row;
        col = _col;
        weightedGraph = new ArrayList<>();
    }

    public void inputMatrix(){
        for(int i = 0; i < row; i++){
            List<Integer> rowMatrix = new ArrayList<>();
            for(int j = 0; j < col; j++){
                Scanner sc = new Scanner(System.in);

                Integer in = sc.nextInt();

                rowMatrix.add(in);
            }
            weightedGraph.add(rowMatrix);
        }
    }

    public void print(){
        for(int i = 0; i < row; i++){
            List<Integer> rowMatrix = weightedGraph.get(i);
            for(int j = 0; j < col; j++){
                System.out.print(rowMatrix.get(j));
            }
        }
    }

    public Integer getRow(){
        return row;
    }
    public Integer getCol(){
        return col;
    }
    public List<List<Integer>> getGraph(){
        return weightedGraph;
    }

    public Integer graphValue(Integer row, Integer col){
        return weightedGraph.get(row).get(col);
    }


}