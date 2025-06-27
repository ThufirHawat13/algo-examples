package org.example;

import java.util.Arrays;
import org.example.testUtils.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSorterTest {

  Sorter sorter = new InsertionSorter();

  @Test
  void sortShouldSort1000ElementsArray() {
    int[] testArray = TestUtils.getArrayWithRandomInts(1000);
    int[] testArrayCopy = Arrays.copyOf(testArray, testArray.length);

    sorter.sort(testArray);
    Arrays.sort(testArrayCopy);

    Assertions.assertEquals(0,
        Arrays.compare(testArray, testArrayCopy));
  }

  @Test
  void sortShouldSort0ElementsArray() {
    Assertions.assertDoesNotThrow(() -> sorter.sort(new int[0]));
  }

  @Test
  void sortShouldSort1ElementsArray() {
    int[] testArray = new int[]{1};

    sorter.sort(testArray);

    Assertions.assertEquals(1, testArray[0]);
  }
}
