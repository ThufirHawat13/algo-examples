package org.example.testUtils;

import java.util.Random;

public final class TestUtils {

  public static int[] getArrayWithRandomInts(int arrayLength) {
    int[] testArray = new int[arrayLength];

    for (int i = 0; i < testArray.length; i++) {
      testArray[i] = new Random().nextInt();
    }

    return testArray;
  }
}
