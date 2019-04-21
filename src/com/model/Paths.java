package com.model;

import java.util.ArrayList;
import java.util.List;


public class Paths {

     List<List<Integer>> paths;

    public Paths(List<List<Integer>> _paths){
        paths = new ArrayList<>();
        paths = _paths;
    }

    public Boolean conditionCheck(Integer x, Integer y){
        return  x < y;
    }

    public Boolean pathValid(Integer i,Integer j, Integer row,Integer col){
        return  i >= 0 && i < row && j >= 0 && j < col;
    }
}