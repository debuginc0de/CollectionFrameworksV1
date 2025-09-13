package com.example.CollectionFrameworksV1.PriorityQueue;

import java.util.*;

public class ComaratorVSComparable {
    public static void main(String[] args) {
        List<student1> map=new ArrayList<>();
        map.add(new student1(1, "Rahul"));
        map.add(new student1(2, "Ritam"));
        map.add(new student1(3, "Rita"));

//        Collections.sort(map);
//        System.out.println(map);

        Comparator<student1> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name);
        Collections.sort(map,nameComparator);

        System.out.println(map);
    }
    static class student implements Comparable<student>{
        int roll;
        String name;

        student(int roll,String name){
            this.name=name;
            this.roll=roll;
        }

        @Override
        public int compareTo(student o) {
            return this.roll-o.roll;
        }
        @Override
        public String toString(){
            return roll+"-"+name;
        }

    }
    static class student1{
        int roll;
        String name;

        student1(int roll,String name){
            this.roll=roll;
            this.name=name;
        }

        @Override
        public String toString(){
            return roll+"-"+name;
        }


    }
}
