package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverserTest {


  @Test
  void reverseShouldReturnFirstNodeOfReversedLinkedList() {
    compareLinkedLists(getFirstNodeOfReversedLinkedList(),
        Reverser.reverse(getFirstNodeOfLinkedList()));
  }

  private void compareLinkedLists(Node expected, Node actual) {
    while (expected != null) {
      Assertions.assertEquals(expected.getVal(), actual.getVal());
      expected = expected.getNext();
      actual = actual.getNext();
    }
  }

  private Node getFirstNodeOfLinkedList() {
    return new Node(1,
        new Node(2,
            new Node(3,
                new Node(4,
                    new Node(5)
                ))));
  }

  private Node getFirstNodeOfReversedLinkedList() {
    return new Node(5,
        new Node(4,
            new Node(3,
                new Node(2,
                    new Node(1)
                ))));
  }
}