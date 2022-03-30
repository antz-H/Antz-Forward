package com.antz.algorithms.quicksort;

/**
 * @author huang.huang
 * @description
 * @date 2021/10/26 21:56
 **/
public class QuickSort2 {

    public void quickSort(final int[] array, int low, int high) {

        if (array.length < 2 || high == 0 || low > high) {
            return;
        }
        int refer_index = partitionSort2(array, low, high);
        //small
        quickSort(array, low, refer_index - 1);
        //big
        quickSort(array, refer_index + 1, high);
    }

    /**
     * 为refer_value 寻找个合适的位子
     *
     * 这个算法难懂
     */
    private int partitionSort(final int[] array, int low, int high) {
        int refer_value = array[high];

        int index = low - 1;

        for (int i = low; i < high; i++) {

            if (array[i] < refer_value) {
                index++;
                swap(array, i, index);
            }
        }
        swap(array, index + 1, high);
        return index + 1;
    }

    /**
     *
     * 分别从L 和 R 启动，一旦发生swap，则从发生swap端启动
     */
    private int partitionSort2(final int[] array, int low, int high) {
        int refer_index = high;
        int refer_value = array[refer_index];

        int l_index = low;
        int r_index = high ;

        while (l_index < r_index) {

            while (l_index < r_index && array[l_index] <= refer_value) {
                l_index++;
            }
            if (l_index < r_index) {
                array[r_index] = array[l_index];
            }

            while (l_index < r_index && array[r_index] >= refer_value) {
                r_index--;
            }

            if (l_index < r_index) {
                array[l_index] = array[r_index];
            }

            if (l_index >= r_index) {
                array[l_index] = refer_value;
            }
        }
        return l_index;
    }

    private void swap(int[] array, int source, int target) {
        int temp = array[target];
        array[target] = array[source];
        array[source] = temp;
    }


}
