package com.collection.hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by huangfuliang on 2017/9/7.
 */
public class Test {

    public static void main(String[] args) {
//        ICustomMap<String, String> cmap = new ICustomHashMap<String, String>();
//        cmap.put("hfl", "ggg");

//        System.out.println(cmap.get("hfl"));


         Map<String, String> map = new ConcurrentHashMap<>();
        map.put("aaa", "bbbb");


//          map.put("hfl", "is god");
//          map.put("hfl", "is i");
//        System.out.println("a1a213123123123123".hashCode() & 5);
//        System.out.println(map.get("hfl"));

//        map.put(null, "12321");
//        Map map = Collections.synchronizedMap(new HashMap());

//        System.out.println(map.get(null));
    }




}
