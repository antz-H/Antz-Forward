package com.antz.algorithms.bubblesort;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BubbleSortTest {


    @Test
    public void test() {

        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int[] actual = new BubbleSort().sort(array);

        int[] expect = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Assertions.assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void test_2() {

        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int[] actual = new BubbleSort().sort_2(array);

        int[] expect = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Assertions.assertThat(actual).isEqualTo(expect);
    }


    @Test
    public void test_3() {

        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int[] actual = new BubbleSort().sort_3(array);

        int[] expect = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Assertions.assertThat(actual).isEqualTo(expect);
    }
}
