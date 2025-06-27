package org.example;

public class SelectionSorter implements Sorter {

  @Override
  public void sort(int[] arr) {
    if (arr.length <= 1) {
      return;
    }

    for (int i = 0; i < arr.length - 1; i++) {
      int first = arr[i];

      for (int j = i + 1; j <= arr.length - 1; j++) {
        int curr = arr[j];

        if (curr < first) {
          arr[i] = curr;
          arr[j] = first;
          first = arr[i];
        }
      }
    }
  }
}
