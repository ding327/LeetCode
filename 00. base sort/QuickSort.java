package com.google.sort;

import java.util.Arrays;

/**
 * 快速排序：冒泡排序的变种，效率>=冒泡排序。
 * 基本思想：指针，递归
 * 基本原理：选定一个基准值，根据基准值将数组分为小于和大于基准值的两部分子序列，然后递归循环，直至全部排序完成。
 * 代码效率：sort1 <= sort2 <= sort3
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        System.out.println("初始是：" + Arrays.toString(arr));
//        sort1(arr, 0, arr.length - 1);
//        sort2(arr, 0, arr.length - 1);
        sort3(arr, 0, arr.length - 1);
        System.out.println("结果是：" + Arrays.toString(arr));
    }

    private static void sort1(int[] arr, int start, int end) {
        int left = start;//左指针
        int right = end;//右指针
        int temp = 0;
        if (left <= right) {
            temp = arr[left];//第一个元素为基准元素
            while (left != right) {
                //从右向左扫描，遇到大于/等于基准值则右指针下标减1
                while (left < right && arr[right] >= temp) {
                    right--;
                }
                swap(arr, left, right);

                //从左向右扫描，遇到小于/等于基准值则左指针下标加1
                while (left < right && arr[left] <= temp) {
                    left++;
                }
                swap(arr, left, right);

                System.out.println("---------交换后：" + Arrays.toString(arr));
            }

            //基准元素归位
            arr[right] = temp;

            System.out.println("---子排序：" + Arrays.toString(arr));

            sort1(arr, start, left - 1);
            sort1(arr, right + 1, end);
        }
    }

    private static void sort2(int[] arr, int start, int end) {
        int left = start;//左指针
        int right = end;//右指针
        int temp = 0;
        if (left <= right) {
            temp = arr[left];//第一个元素为基准元素
            while (left != right) {
                //从右向左扫描，遇到大于/等于基准值则右指针下标减1
                while (left < right && arr[right] >= temp) {
                    right--;
                }

                //从左向右扫描，遇到小于/等于基准值则左指针下标加1
                while (left < right && arr[left] <= temp) {
                    left++;
                }

                if (left < right) {
                    swap(arr, left, right);
                }

                System.out.println("---------交换后：" + Arrays.toString(arr));
            }

            //基准元素归位
            arr[start] = arr[left];
            arr[left] = temp;

            System.out.println("---子排序：" + Arrays.toString(arr));

            sort2(arr, start, left - 1);
            sort2(arr, right + 1, end);
        }
    }

    private static void sort3(int[] arr, int start, int end) {
        int left = start;//左指针
        int right = end;//右指针
        int temp = 0;
        if (left <= right) {
            temp = arr[left];//第一个元素为基准元素
            while (left != right) {
                //从右向左扫描，遇到大于/等于基准值则右指针下标减1
                while (left < right && arr[right] >= temp) {
                    right--;
                }

                if (left < right) {
                    arr[left++] = arr[right];
                }

                //从左向右扫描，遇到小于/等于基准值则左指针下标加1
                while (left < right && arr[left] <= temp) {
                    left++;
                }

                if (left < right) {
                    arr[right--] = arr[left];
                }

                System.out.println("---------交换后：" + Arrays.toString(arr));
            }

            //基准元素归位
            arr[left] = temp;

            System.out.println("---子排序：" + Arrays.toString(arr));

            sort3(arr, start, left - 1);
            sort3(arr, right + 1, end);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        if (a == b) {
            return;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
