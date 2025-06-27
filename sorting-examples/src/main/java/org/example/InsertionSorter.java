package org.example;

public class InsertionSorter implements Sorter {

  @Override
  public void sort(int[] arr) {
    if (arr.length <= 1) {
      return;
    }

    for (int i = 0; i < arr.length; i++){
      for (int j = 0; j < i; j++) {
        if (arr[i] <= arr[j]) {
          shiftArrayCyclic(arr, j, i);
          break;
        }
      }
    }
  }

  private void shiftArrayCyclic(int[] arr, int from, int to) {
    int current = arr[from];

    for (int i = from; i < to; i++) {
      int next = arr[i+1];
      arr[i+1] = current;
      current = next;
    }

    arr[from] = current;
  }
}
