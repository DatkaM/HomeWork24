package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println("set1: \n" + set1);
        System.out.println("set2: \n" + set2);
        System.out.println("Joop:\n " + symmetricDifference(set1, set2));


    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        set2.removeAll(set1);
        difference.addAll(set2);
        return difference;
    }
}
