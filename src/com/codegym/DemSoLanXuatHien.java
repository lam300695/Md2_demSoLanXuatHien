package com.codegym;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String chuoi = sc.nextLine();
        String [] arr = chuoi.split(" ");

        Map < String,Integer> map = new HashMap<>();

        for (String x : arr){
            if (map.containsKey(x)){
                map.put(x,map.get(x) + 1);
            }
            else {
                map.put(x,1);
            }
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
