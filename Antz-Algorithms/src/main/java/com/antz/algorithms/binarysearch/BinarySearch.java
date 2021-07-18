package com.antz.algorithms.binarysearch;

/**
 * @author huang.huang
 * @description
 * @date 2021/7/17 22:25
 *
 * 最好时间 O(1)
 * 平均时间 O(log n)
 * 最坏时间 O(log n)
 * 空间    O(1)
 **/
public class BinarySearch {

    @Deprecated
    public int find(int[] sortedArray, int target) {

        int middleIndex = sortedArray.length / 2;
        if (sortedArray[middleIndex] == target) {
            return middleIndex;
        }

        do {
            middleIndex = (sortedArray.length + middleIndex) / 2;
        } while (sortedArray[middleIndex] != target);


        return middleIndex;
    }

    public int find_equals_first(int[] sortedArray, int target) {
        int fromIndex = 0;
        int endIndex = sortedArray.length;
        int middleIndex = sortedArray.length / 2;

        while (sortedArray[middleIndex] != target) {

            if (sortedArray[middleIndex] > target) {
                endIndex = middleIndex;
            } else {
                fromIndex = middleIndex;
            }
            middleIndex = (endIndex + fromIndex) / 2;
        }
        while (middleIndex != 0 && sortedArray[middleIndex - 1] == sortedArray[middleIndex]) {
            middleIndex--;
        }

        return middleIndex;
    }
}
