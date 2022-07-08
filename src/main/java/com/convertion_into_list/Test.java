package com.convertion_into_list;

import java.util.*;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(14, "kunal");
        map.put(101, "ram");
        map.put(104, "shyam");
        map.put(11, "sam");
        map.put(21, "ballu");
        System.out.println(map);
        for (Integer i : map.keySet()) {
            System.out.println(i);
        }
        System.out.println("\n");
        for (String string : map.values()) {
            System.out.println(string);
        }

        for (Map.Entry<Integer, String> entries : map.entrySet()) {

            System.out.println(entries.getKey() + " " + entries.getValue());
        }
        System.out.println("map converted into list");
        List<Integer> integerList = map.keySet().stream().collect(Collectors.toList());
        for (Integer i : integerList) {
            System.out.println(i);
        }
        System.out.println("map converted into list");

        List<String> stringList = map.values().stream().collect(Collectors.toList());
        for (String string : stringList) {
            System.out.println(string);
        }

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (Integer integer : map.keySet()) {
            integerArrayList.add(integer);
        }

        System.out.println("arrayList");
        System.out.println(integerArrayList);

        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String string : map.values()) {
            stringArrayList.add(string);
        }
        System.out.println("stringArrayList");
        System.out.println(stringArrayList);

        System.out.println("map into TreeSet");
        TreeSet<Integer> integerTreeSet = new TreeSet<>(map.keySet());
        for (Integer integer : integerTreeSet) {
            System.out.println(integer);
        }
        System.out.println("stringTreeSet");
        TreeSet<String> stringTreeSet = new TreeSet<>(map.values());
        for (String string : stringTreeSet) {
            System.out.println(string);

        }
    }
}
