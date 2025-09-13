package com.example.CollectionFrameworksV1.IBM_series;

import java.util.HashMap;
import java.util.Map;

public class ColorCoding {
    public static String findRegistorColor(int power,int curr){
        if (power<=0 || curr<=0 ||power<=curr){
            return "Invalid";
        }
        int resistance=power/(curr*curr);
        String res_str=String.valueOf(resistance);
        if (res_str.length()>2){
            res_str=res_str.substring(0,2)+"0".repeat(res_str.length()-2);
            resistance=Integer.parseInt(res_str);
        }
        int first_digit=Character.getNumericValue(res_str.charAt(0));
        int secDigit = Character.getNumericValue(res_str.charAt(1));
        int mul_digit=res_str.length() - 2;

        Map<Integer,String> map=new HashMap<>();
        map.put(0,"BLK");
        map.put(1,"BRN");
        map.put(2,"RED");
        map.put(3,"ONG");
        map.put(4,"YLN");
        map.put(5,"GRN");

        if (!map.containsKey(first_digit) || !map.containsKey(secDigit) || !map.containsKey(mul_digit) ){
            return "Invalid";
        }
        return (map.get(first_digit) + " " + map.get(secDigit) +" "+map.get(mul_digit));
    }
    public static void main(String[] args) {
        int power=4500000;
        int curr=10;
        System.out.println(findRegistorColor(power,curr));

    }
}
