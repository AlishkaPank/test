package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();

        System.out.println("test add for arrayList " + Test.testAdd(arrayList));
        System.out.println("test add for linkedList " + Test.testAdd(linkedList));
        System.out.println("test add for hashSet " + Test.testAdd(hashSet));
        System.out.println("test add for treeSet " + Test.testAdd(treeSet));

        System.out.println("test add to the beginning for arrayList " + Test.testAddToTheBeginning(arrayList));
        System.out.println("test add to the beginning for linkedList " + Test.testAddToTheBeginning(linkedList));

        System.out.println("test add to the end for arrayList " + Test.testAddToTheEnd(arrayList));
        System.out.println("test add to the end for linkedList " + Test.testAddToTheEnd(linkedList));

        System.out.println("test add with contains " + Test.testAddContains(hashSet));
        System.out.println("test add with contains " + Test.testAddContains(treeSet));
        System.out.println("test add with contains " + Test.testAddContains(arrayList));
        System.out.println("test add with contains " + Test.testAddContains(linkedList));

    }
}
