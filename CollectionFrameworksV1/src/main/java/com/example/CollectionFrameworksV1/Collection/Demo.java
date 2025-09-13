package com.example.CollectionFrameworksV1.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        List<String> values=new ArrayList<>();
        values.add("Rahul");
        values.add("Ritam");
        values.add("Rita");

        //size
        System.out.println(values.size());
        //isEmpty
        System.out.println(values.isEmpty());
        //contains
        System.out.println(values.contains("Rita"));
        //toArray-> Object
        Object[] arr= values.toArray();
        for (Object o:arr){
            System.out.print((String) o+", ");
        }
        System.out.println();

        //toArray---->  String
        String[] str=values.toArray(new String[0]);
        for(String name:str){
            System.out.print(name+", ");
        }

        Stack<String> st=new Stack<>();
        st.push("Swastika");
        st.push("Ram");
        st.push("Jon");
        //addAll
        values.addAll(st);
        System.out.println(values.containsAll(st));

        //ContainsAll
        values.remove(String.valueOf("Ram"));
        System.out.println(values.containsAll(st));



    }
}
