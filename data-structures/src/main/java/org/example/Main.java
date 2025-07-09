package org.example;

public class Main {

  public static void main(String[] args) {
    MyHashMap<String, Integer> map = new MyHashMap<>();

    map.put("1", 1);
    map.put("1", 11);
    map.put("2", 2);
    map.put("3", 3);

    System.out.println(map.get("1"));
    System.out.println(map.get("2"));
    System.out.println(map.get("3"));
  }
}