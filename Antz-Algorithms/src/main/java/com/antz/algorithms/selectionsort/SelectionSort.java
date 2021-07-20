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
 *
 * 每轮遍历都是会选择一个最大（小）的元素，与BubbleSort区别是每次都是选择一个元素依次与每一个其它元素compare and swap，
 *
 * 首先将array分成两组，第一组是sorted-array，第二组是unsorted-array，每次遍历找出最小的元素，放进sorted-array
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
