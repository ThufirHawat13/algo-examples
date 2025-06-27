package org.example;

public class Main {

  public static void main(String[] args) {
    int[] arr = new int[]{2,3,5,7,1,0,8,4,6};

    new SimpleQuickSorter().sort(arr);

    for (int num : arr) {
      System.out.println(num);
    }
  }
}