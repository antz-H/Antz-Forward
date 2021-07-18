package com.antz.algorithms.selectionsort;

/**
 * @author huang.huang
 * @description
 * @date 2021/7/18 22:04
 * 最好时间 O(n^2)
 * 平均时间 O(n^2)
 * 最坏时间 O(n^2)
 * 空间    O(1)
 * 不稳定排序
 **/
public class SelectionSort {

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


}
