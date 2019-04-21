package com.model;

import java.util.ArrayList;
import java.util.List;


public class Paths {

     List<List<Integer>> paths;
     Integer row;
     Integer col;

    public Paths(List<List<Integer>> _paths,Integer _row,Integer _col){
        paths = new ArrayList<>();
        paths = _paths;
        row = _row;
        col = _col;
    }

    public Boolean conditionCheck(Integer x, Integer y){
        return  x < y;
    }

    public Boolean pathValid(Integer i,Integer j){
        return  i >= 0 && i < row && j >= 0 && j < col;
    }
}