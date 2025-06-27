package org.example;

public class BubbleSorter implements Sorter {

  @Override
  public void sort(int[] arr) {
    for (int i = 0; i <= arr.length -1; i++) {
      iterateAndSwapAdjacentUnorderedElements(arr);
    }
  }

  private void iterateAndSwapAdjacentUnorderedElements(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int curr = arr[i];
      int next = arr[i+1];

      if (curr > next) {
        arr[i] = next;
        arr[i+1] = curr;
      }
    }
  }
}
