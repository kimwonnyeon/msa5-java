package org.example.e10collection;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();

        hashMap.put("age",20);
        hashMap.put("price",10000);
        hashMap.put("price",20000); // 덮어씀

        System.out.println(hashMap.get("price"));
    }
}
