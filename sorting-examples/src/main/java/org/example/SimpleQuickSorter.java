package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleQuickSorter implements Sorter {

  @Override
  public void sort(int[] arr) {
    System.arraycopy(
        toArray(quickSort(toList(arr))),
        0, arr, 0, arr.length);
  }

  private List<Integer> quickSort(List<Integer> list) {
    if (list.size() == 0 || list.size() == 1) {
      return list;
    }

    int pivot = popPivotFromList(list.size() / 2, list);

    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();

    list.forEach(num -> {
      if (num > pivot) {
        right.add(num);
      } else {
        left.add(num);
      }
    });

    return mergeLists(quickSort(left), List.of(pivot), quickSort(right));
  }

  private int popPivotFromList(int index, List<Integer> list) {
    int result = list.get(index);
    list.remove(index);

    return result;
  }

  @SafeVarargs
  private List<Integer> mergeLists(List<Integer>... lists) {
    List<Integer> result = new ArrayList<>();

    Arrays.stream(lists)
        .forEach(result::addAll);

    return result;
  }

  private int[] toArray(List<Integer> list) {
    return list
        .stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }

  private List<Integer> toList(int[] arr) {
    return Arrays.stream(arr)
        .boxed()
        .collect(Collectors.toList());
  }
}
