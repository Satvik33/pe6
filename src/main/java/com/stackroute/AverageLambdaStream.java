package com.stackroute;

import java.util.List;

public class AverageLambdaStream {

        public static Double average(List<Integer> list){
            return list.stream().mapToInt(i -> i).average().getAsDouble();
        }
}
