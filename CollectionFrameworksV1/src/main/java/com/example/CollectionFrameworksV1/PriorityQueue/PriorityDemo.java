package com.example.CollectionFrameworksV1.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.add(5);
        queue.add(2);
        queue.add(3);
        queue.add(15);
        queue.add(10);

        //Min heap

        queue.forEach((Integer val)-> System.out.println(val));
        while (!queue.isEmpty()){
            int val=queue.poll();
            System.out.println("remove "+val);
        }

        //max Heap

        PriorityQueue<Integer> queue1=new PriorityQueue<>(Collections.reverseOrder());
        queue1.add(5);
        queue1.add(2);
        queue1.add(3);
        queue1.add(15);
        queue1.add(10);

        queue1.forEach((Integer val)-> System.out.println(val));
        while (!queue1.isEmpty()){
            System.out.println("Remove "+queue1.poll());
        }
    }
}
