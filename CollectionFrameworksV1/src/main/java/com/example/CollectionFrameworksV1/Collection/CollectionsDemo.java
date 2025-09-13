package com.example.CollectionFrameworksV1.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(111);
        list.add(112);
        list.add(0);


        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        //List<Integer> val= (List<Integer>) Collections.reverseOrder();
    }

}
