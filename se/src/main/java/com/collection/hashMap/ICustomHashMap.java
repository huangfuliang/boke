package com.collection.hashMap;


/**
 * Created by huangfuliang on 2017/9/7.
 */
public class ICustomHashMap<K, V> implements ICustomMap {

    static Integer defalutCapacity = 16;

    Entry<K,V>[] table = null;

    ICustomHashMap() {
        table = new Entry[defalutCapacity];
    }

    @Override
    public Object put(Object key, Object value) {

        int hash = key.hashCode();

        int i = indexFor(hash);
        /**
         *
         * 遍历这个数组上的没一个节点，观察是否有相同的，如果有相同的节点那么就替换掉
         * 判断两个对象是否相等（hashcode是否相等 + equals是否相同）
         */
        for (Entry<K, V> e = table[i]; e != null ; e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
                e.value = (V) value;
                return key;
            }
        }

        table[i] = new Entry(key, value, table[i], hash);

        return null;
    }


    int indexFor(int hash) {
        return hash & defalutCapacity;
    }


    @Override
    public Object get(Object key) {

        int hash = key.hashCode();

        int i = indexFor(hash);

        for (Entry<K, V> e = table[i]; e != null; e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
                return e.getValue();
            }
        }

        return null;
    }

    static class Entry<K,V> implements ICustomMap.Entry<K,V> {
        K key;
        V value;
        Entry<K, V> next;
        int hash;

        Entry(K k, V v, Entry<K, V> e, int h) {
            key = k;
            value = v;
            next = e;
            hash = h;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }
    }
}
