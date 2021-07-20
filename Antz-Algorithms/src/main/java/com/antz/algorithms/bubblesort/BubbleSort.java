package com.antz.algorithms.bubblesort;

/**
 * @author huang.huang
 * @description
 * @date 2021/7/18 22:46
 *
 * 最好时间 O(n)
 * 平均时间 O(n^2)
 * 最坏时间 O(n^2)
 * 空间    O(1)
 * 稳定排序
 *
 * 每轮遍历都是会选择一个最大（小）的元素，与SelectionSort区别是每次都是相邻元素进行compare and swap，
 **/
public class BubbleSort {


    public int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
