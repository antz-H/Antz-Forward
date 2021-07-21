package com.antz.algorithms.insertionsort;

/**
 * @author huang.huang
 * @description
 * @date 2021/7/20 10:31
 * 最好时间 O(n^2)
 * 平均时间 O(n^2)
 * 最坏时间 O(n^2)
 * 空间    O(1)
 * 稳定排序
 *
 * 选取一个元素作为较小值，依次与前面的值比较，当大于最小值时，将最小值插入到该值前面（对于数组而言，就是将该值后移一位，将最小值放在该值原来的位置上）
 *
 * 算法要点
 * 1. 可以从左至右，但必须从[1]开始 ；也可以从右至左，但必须从[n-1]开始
 * 2. 该算法不存在swap，而是将较小值插入到较大值前面
 * 3. 对于数组来说，插入算法还是不太友好，因为要后移一位，可能更适合链表
 *
 **/
public class InsertionSort {


    public int[] sort(int[] array) {
        int small;

        for (int i = 1; i < array.length; i++) {
            small = array[i];
            int j;
            for (j = i; j >= 1; j--) {

                if (small < array[j - 1]) {
                    array[j] = array[j - 1];
                } else {
                    break;
                }
            }
            array[j] = small;
        }
        return array;
    }

    public int[] sort_2(int[] array) {
        int small;

        for (int i = 1; i < array.length; i++) {
            small = array[i];
            int j = i;

            while (j >=1 && small < array[j-1]){
                array[j] = array[j-1];
                j-- ;
            }
            array[j] = small;
        }
        return array;
    }
}
