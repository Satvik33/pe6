package com.stackroute;

import java.util.List;
import java.util.stream.Collectors;

public class TransformLambdaStream {
    public static String getString(List<Integer> list) {
        // Your code goes here
        return list.stream().map(s -> {
            if(s%2==0){
                return "e" + String.valueOf(s);
            }
            else {
                return "o" + String.valueOf(s);
            }
        }).collect(Collectors.joining(","));
    }
}
