package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AverageLambdaStreamTest {

    @Test
    public void average() {
        List<Integer> list = new ArrayList<>();
        list.add(48);
        list.add(52);
        list.add(56);
        list.add(60);
        list.add(64);
        list.add(68);
        System.out.println(AverageLambdaStream.average(list));
    }
}