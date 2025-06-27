package org.example;

public class BinarySearcher implements Searcher {

  @Override
  public int searchIndexOfNum(int num, int[] arr) {

    int left = 0;
    int right = arr.length - 1;
    int mid = right / 2;

    while (num != arr[mid]) {
      if (num < arr[mid]) {
        right = mid;
      } else {
        left = mid;
      }
      mid = (right + left) / 2;
    }

    return mid;
  }
}
