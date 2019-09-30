package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterLambdaStreamTest {
    @Test
    public void search() {
        List<String> list = new ArrayList<>();
        list.add("arjun");
        list.add("ali");
        list.add("Munna");
        list.add("abu");
        list.add("ash");
        List<String> list2 = new ArrayList<>(FilterLambdaStream.search(list));
        System.out.println("Original List");
        for (String item:list) {
            System.out.println(item);
        }
        System.out.println("Filtered List");
        for (String item:list2) {
            System.out.println(item);
        }
    }
}
