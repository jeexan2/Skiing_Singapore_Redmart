package com.skiing;

import com.model.Graph_Node_Factory;
import com.model.WeightedGraphMatrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer row,col;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();
        WeightedGraphMatrix graph = new WeightedGraphMatrix(row,col);
        graph.inputMatrix();
        graph.print();
        Graph_Node_Factory graph_node_factory = new Graph_Node_Factory();
        graph_node_factory.makeGraphNodes(graph);


    }
}
