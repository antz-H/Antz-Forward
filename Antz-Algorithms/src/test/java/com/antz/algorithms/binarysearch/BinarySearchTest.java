package com.antz.algorithms.binarysearch;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchTest {

    @Test
    public void test_base() {

        int[] sortedArray = new int[]{1, 2, 3, 4, 5};
        int target = 3;
        int targetIndex = 2;

        int result = new BinarySearch().find_equals_first(sortedArray, target);

        Assertions.assertThat(result).isEqualTo(targetIndex);
    }

    @Test
    public void test_base_equals() {

        int[] sortedArray = new int[]{1, 2, 3, 3, 4, 5};
        int target = 3;
        int targetIndex = 2;

        int result = new BinarySearch().find_equals_first(sortedArray, target);

        Assertions.assertThat(result).isEqualTo(targetIndex);
    }


    @Test
    public void test_base_equals2() {

        int[] sortedArray = new int[]{1, 2, 3, 3, 3, 4, 5};
        int target = 3;
        int targetIndex = 2;

        int result = new BinarySearch().find_equals_first(sortedArray, target);

        Assertions.assertThat(result).isEqualTo(targetIndex);
    }

    @Test
    public void test_auto() {

        int size = 1000;
        int[] sortedArray = getSortArray(size);

        int targetIndex = new Random().nextInt(size);
        int target = sortedArray[targetIndex];
        System.out.println(targetIndex + "-----" + target);

        int result = new BinarySearch().find_equals_first(sortedArray, target);
        Assertions.assertThat(result).isEqualTo(targetIndex);
    }

    private int[] getSortArray(int bound) {

        int[] array = new Random().ints(bound).toArray();

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        return array;
    }

    @Test
    public void test1() {

        getSortArray(10);

    }

}
