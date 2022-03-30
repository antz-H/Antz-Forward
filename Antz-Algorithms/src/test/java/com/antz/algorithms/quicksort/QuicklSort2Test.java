package com.antz.algorithms.quicksort;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class QuicklSort2Test {


    @Test
    public void quickSort() {

        int[] array = {1, 4, 3, 7, 0, 9, 1, 6, 8};
        int[] expect = {0, 1, 1, 3, 4, 6, 7, 8, 9};

        new QuickSort2().quickSort(array,0,array.length-1);

        QuickSort.print(array);
        Assertions.assertThat(array).isEqualTo(expect);
    }
}
