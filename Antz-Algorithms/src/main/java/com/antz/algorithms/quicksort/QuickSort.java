package com.antz.algorithms.quicksort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author huang.huang
 * @description
 * @date 2021/10/25 21:28
 **/
public class QuickSort {

    /**
     * 思想：分治
     * 1. 选择第一个元素，作为基准数flag；
     * 2. 将大于flag的数放在该数的右边，小于flag的数放在该数的左边；
     * 3. 递归划分每一个数组，递归1-2，直到满足基线条件 length < 2 ;
     */

    public int[] quickSort(int[] sortArr) {

        if (sortArr.length < 2) {
            return sortArr;
        }
        int mid_index = 0;
        int mid_value = sortArr[mid_index];

        int[] small = small(sortArr, mid_index);
        int[] big = big(sortArr, mid_index);

        return append(quickSort(small), mid_value, quickSort(big));
    }

    private int[] small(int[] arr, int mid_index) {
        int mid_value = arr[mid_index];
        int[] smalls = new int[arr.length];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= mid_value) {
                smalls[index] = arr[i];
                index++;
            }
        }
        return Arrays.copyOf(smalls, index);
    }

    private int[] big(int[] arr, int mid_index) {
        int mid_value = arr[mid_index];
        int[] bigs = new int[arr.length];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > mid_value) {
                bigs[index] = arr[i];
                index++;
            }
        }
        return Arrays.copyOf(bigs, index);
    }

    private int[] append(int[] small, int mid_value, int[] big) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : small) {
            list.add(i);
        }

        list.add(mid_value);

        for (int i : big) {
            list.add(i);
        }
        return toArray(list);
    }

    private int[] toArray(ArrayList<Integer> list) {
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }




    public static void print(int[] newOne) {
        Arrays.stream(newOne).forEach(o -> System.out.print(o +" "));

    }


}
