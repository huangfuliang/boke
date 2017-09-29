package com.collection.hashMap;

import java.util.Map;

/**
 * Created by huangfuliang on 2017/9/7.
 */
public interface ICustomMap<K, V> {

    K put(K key, V value);

    V get(K key);

    interface Entry<K, V> {
        K getKey();

        V getValue();
    }

}
