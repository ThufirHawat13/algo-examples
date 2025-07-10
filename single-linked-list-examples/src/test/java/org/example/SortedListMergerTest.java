package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortedListMergerTest {
  @Test
  void reverseShouldReturnFirstNodeOfReversedLinkedList() {
    compareLinkedLists(getFirstNodeOfMergedLinkedList(),
        SortedListMerger.merge(getFirstNodeOfFirstLinkedList(), getFirstNodeOfSecondLinkedList()));
  }

  private void compareLinkedLists(Node expected, Node actual) {
    while (expected != null) {
      Assertions.assertEquals(expected.getVal(), actual.getVal());
      expected = expected.getNext();
      actual = actual.getNext();
    }
  }

  private Node getFirstNodeOfFirstLinkedList() {
    return new Node(1,
        new Node(2,
            new Node(3
                )));
  }

  private Node getFirstNodeOfSecondLinkedList() {
    return new Node(2,
        new Node(3,
            new Node(5
                )));
  }

  private Node getFirstNodeOfMergedLinkedList() {
    return new Node(1,
        new Node(2,
            new Node(2,
                new Node(3,
                    new Node(3,
                        new Node(5)
                    )))));
  }
}