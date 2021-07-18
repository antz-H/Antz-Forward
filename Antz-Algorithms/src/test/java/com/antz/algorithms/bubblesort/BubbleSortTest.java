package com.antz.algorithms.bubblesort;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BubbleSortTest {


    @Test
    public void test() {

        int[] array = new int[]{3, 2, 3, 5, 8, 0, 1};

        int[] actual = new BubbleSort().sort(array);

        int[] expect = new int[]{0, 1, 2, 3, 3, 5, 8};

        Assertions.assertThat(actual).isEqualTo(expect);
    }
}
