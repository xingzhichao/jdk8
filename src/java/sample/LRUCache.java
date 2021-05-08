package java.sample;

/**
 * package com.alibaba.druid.util;
 * 粘贴的druid的代码
 * <p>
 * <p>
 * LRU 即 Least Recently Used，最近最少使用。当缓存满了，会优先淘汰那些
 * 最近最不常访问的数据。 LinkedList 提供了一个 boolean 值 accessOrder（true，
 * 所有的 Entry 按照访问的顺序排列）可以让用户指定是否实现 LRU。每次访问都
 * 把访问的那个数据移到双向队列的尾部去。
 **/


import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private static final long serialVersionUID = 1L;
    private final int maxSize;

    public LRUCache(int maxSize) {
        this(maxSize, 16, 0.75f, false);
    }

    public LRUCache(int maxSize, int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
        this.maxSize = maxSize;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > this.maxSize;
    }
}

