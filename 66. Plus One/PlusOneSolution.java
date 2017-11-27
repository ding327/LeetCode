package com.google.leetcode;

import java.util.Arrays;

/**
 * Created by Ding on 2017/11/27.
 * https://leetcode.com/problems/plus-one/description/
 * 一个非空且所有元素都非负的整形数组，从最后一个元素开始，当元素 +1 后判断是否有进位现象。
 * 即判断+1后该元素是否大于9 ，>9则把该元素变为0然后判断下一位，依次类推。反之，则该元素+1后返回该数组。
 * 当数组的首位元素 +1 后也 >9 则新增元素1在首位，然后返回该数组。
 */

public class PlusOneSolution {
    public static int[] plusOne(int[] digits) {
        if (digits == null) {
            return null;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNum = new int[digits.length + 1];
        newNum[0] = 1;
        return newNum;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] ints = plusOne(arr);
        System.out.println("结果是：" + Arrays.toString(ints));
    }
}
