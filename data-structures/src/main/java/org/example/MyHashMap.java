package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap<K, V> {

  private final List<Pair>[] buckets = new ArrayList[10];


  public V put(K key, V value) {
    int index = key.hashCode() % buckets.length;
    V previousValue = null;

    boolean alreadyPresent = false;

    if (buckets[index] == null) {
      buckets[index] = new ArrayList<>();
    }

    for (Pair pair : buckets[index]) {
      if (pair.key.equals(key)) {
        previousValue = pair.value;
        pair.value = value;
        alreadyPresent = true;
        break;
      }
    }

    if (!alreadyPresent) {
      buckets[index].add(new Pair(key, value));
    }

    return previousValue;
  }

  public V get(K key) {
    V result = null;

    for (Pair pair : buckets[key.hashCode() % buckets.length]) {
      if (pair.key.equals(key)) {
        result = pair.value;
      }
    }

    return result;
  }

  private class Pair {
    K key;
    V value;

    public Pair(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }
}
