package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TransformLambdaStreamTest {
    @Test
    public void getString() {
        List<Integer> list = new ArrayList<>();
        list.add(66);
        list.add(45);
        String res = TransformLambdaStream.getString(list);
        System.out.println(res);
    }
}
