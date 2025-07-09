package org.example;

public class Reverser {

  /**
   * @param node head node
   * @return return head of reversed node
   */
  public static Node reverse(Node node) {
    return reverse(null, node);
  }

  private static Node reverse(Node prev, Node curr) {
    if (curr == null) {
      return prev;
    }

    Node tmp = curr.getNext();

    curr.setNext(prev);

    return reverse(curr, tmp);
  }
}
