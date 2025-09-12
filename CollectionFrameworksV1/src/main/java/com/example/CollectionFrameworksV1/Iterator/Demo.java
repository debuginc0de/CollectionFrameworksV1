package com.example.CollectionFrameworksV1.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(7);
        values.add(8);
        values.add(10);

        //Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Integer> listIt = values.iterator();
        int val;
        while (listIt.hasNext()) {
            val = listIt.next();
            System.out.println(val);
            if (val == 10) {
                listIt.remove();
            }
        }
        System.out.println("After remove: ");
        for (int ans : values) {
            System.out.println(ans);
        }
        //Using For-each
        System.out.println("Using For Each: ");
        values.forEach(System.out::println); //Lambda Expression

    }


}
