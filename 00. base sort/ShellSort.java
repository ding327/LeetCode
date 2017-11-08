package com.google.sort;

import java.util.Arrays;

/**
 * 插入排序の希尔排序，也成为缩小增量排序
 * 希尔排序是直接插入排序的变种。
 * 基本思想：递归
 * 基本原理：将数组根据增量分成若干子序列，子序列进行直接插入排序，然后递归循环缩小增量进行插入排序，最终增量为0，排序完成
 */

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        sort1(arr);
//        sort2(arr);
        System.out.println("结果是：" + Arrays.toString(arr));
    }

    public static void sort1(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动法
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
                System.out.println("本次排序结果：" + Arrays.toString(arr));
            }
            System.out.println("\t\t结束一次排序");
        }
    }

    public static void sort2(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    //插入排序采用交换法
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
}
