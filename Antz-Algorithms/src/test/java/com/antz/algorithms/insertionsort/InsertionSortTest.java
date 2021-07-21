package com.antz.algorithms.insertionsort;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class InsertionSortTest {

    @Test
    public void test() {

        int[] array = new int[]{3, 2, 3, 5, 8, 0, 1};

        int[] actual = new InsertionSort().sort(array);

        int[] expect = new int[]{0, 1, 2, 3, 3, 5, 8};

        Assertions.assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void test2(){
        int[] assert_array = getSortArray(10000);

        int[]  want_array = Arrays.copyOf(assert_array,assert_array.length);
        Arrays.sort(want_array);

        int[] actual = new InsertionSort().sort(assert_array);

        Assertions.assertThat(actual).isEqualTo(want_array);

    }

    @Test
    public void test3(){
        int[] assert_array = getSortArray(10000);

        int[]  want_array = Arrays.copyOf(assert_array,assert_array.length);
        Arrays.sort(want_array);

        int[] actual = new InsertionSort().sort_2(assert_array);

        Assertions.assertThat(actual).isEqualTo(want_array);

    }

    private int[] getSortArray(int bound) {
        int[] array = new Random().ints(bound).toArray();
        return array;
    }

}
