package org.example;

public class Main {

  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,15,18,21,50,700,222};

    System.out.println(new BinarySearcher().searchIndexOfNum(1, arr));
    System.out.println(arr[new BinarySearcher().searchIndexOfNum(1, arr)]);
  }
}