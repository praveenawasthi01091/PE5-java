package com.stackroute.main;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {

        Set<String> hashSet=  new LinkedHashSet<>();
        hashSet.add("Harry");
        hashSet.add("Olive");
        hashSet.add("Alice");
        hashSet.add("Bluto");
        hashSet.add("Eugene");
        Iterator<String>i=hashSet.iterator();
        Set<String> treeSet=  new TreeSet<>(hashSet);
        List<String>list=new ArrayList<>(treeSet);
        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(list);
        


    }
}
