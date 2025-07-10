package org.example;

public class SortedListMerger {

  public static Node merge(Node node1, Node node2) {
    if (node1 == null) {
      return node2;
    } else if (node2 == null) {
      return node1;
    }

    if (node1.getVal() < node2.getVal()) {
      node1.setNext(merge(node1.getNext(), node2));

      return node1;
    } else {
      node2.setNext(merge(node1, node2.getNext()));

      return node2;
    }
  }
}
