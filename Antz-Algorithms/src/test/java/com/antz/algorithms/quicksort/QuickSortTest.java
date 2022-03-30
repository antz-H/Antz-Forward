package com.antz.algorithms.quicksort;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {


    @Test
    public void quickSort() {
        int[] array = {1, 4, 3, 7, 0, 9, 1, 6, 8, 9};
        int[] expect = {0, 1, 1, 3, 4, 6, 7, 8, 9, 9};
        int[] actual = new QuickSort().quickSort(array);
        QuickSort.print(actual);
        Assertions.assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void quickSort2() {
        int[] array = {1, 4, 3, 7, 0, 9, 1, 6, 8};
        int[] expect = {0, 1, 1, 3, 4, 6, 7, 8, 9};
        int[] actual = new QuickSort().quickSort(array);
        QuickSort.print(actual);
        Assertions.assertThat(actual).isEqualTo(expect);
    }
}
