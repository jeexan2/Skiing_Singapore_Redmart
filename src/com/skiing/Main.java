package com.skiing;

import com.model.WeightedGraphMatrix;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeightedGraphMatrix graph = new WeightedGraphMatrix(1,1);
        graph.inputMatrix();
        graph.print();
    }
}
