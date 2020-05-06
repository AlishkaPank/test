package com.company;

import java.util.Collection;
import java.util.List;

public class Test {

    public static int ITERATIONS_COUNT = 70000;

    public static long testAdd(Collection<Integer> collection){

        long startTime = System.currentTimeMillis();

        for (int i = 0; i<ITERATIONS_COUNT; i++){
            collection.add(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static long testAddToTheBeginning(List<Integer> collection){

        long startTime = System.currentTimeMillis();

        for (int i = 0; i<ITERATIONS_COUNT; i++){
            collection.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static long testAddToTheEnd(List<Integer> collection) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATIONS_COUNT; i++) {
            collection.add(collection.size(), i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

    public static long testAddContains(Collection<Integer> collection) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATIONS_COUNT; i++) {
            collection.add(i);
            boolean got = collection.contains(1);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }
}
