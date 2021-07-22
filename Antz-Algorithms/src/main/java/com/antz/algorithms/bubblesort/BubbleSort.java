package com.antz.algorithms.bubblesort;

/**
 * @author huang.huang
 * @description
 * @date 2021/7/18 22:46
 * <p>
 * 最好时间 O(n)
 * 平均时间 O(n^2)
 * 最坏时间 O(n^2)
 * 空间    O(1)
 * 稳定排序
 * <p>
 * 每轮遍历都是会选择一个最大（小）的元素，与SelectionSort区别是每次都是相邻元素进行compare and swap，
 * <p>
 * 算法要点
 * 1. 在于相邻元素 compare and swap（区别其他算法的要点）
 * 2. 每一轮都会选择出一个最大（小）的元素
 **/
public class BubbleSort {

    /**
     * 从上往下，把大值下沉，所以每次选出的是最大值，这样每一轮必须都是从头开始
     * <p>
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            // 因为大值下沉，所以随着i的增加，array.length -i 的位置已经是有序的，那么可以减少排序的次数
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println("sort total = " + count);
        return array;
    }

    /**
     * second way
     * 从上向下，每次选出当前轮中最小的值，所以每一轮都无法选择最大或最小值，但是所有遍历完以后，自动就是有序的
     * <p>
     *
     * @param array
     * @return
     */
    public int[] sort_2(int[] array) {
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    count++;
                }
            }
        }
        System.out.println("sort_2 total = " + count);
        return array;
    }

    /**
     * third way
     *
     * @param array
     * @return 从底向上把小值往上冒泡，每一轮都能选择个较小值，这样可以减少排序的次数，仅需比较j>i的情况
     * <p>
     */
    public int[] sort_3(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            int j = array.length - 1;

            while (j > i) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                j--;
                count++;
            }
        }
        System.out.println("sort_3 total = " + count);
        return array;
    }

}
