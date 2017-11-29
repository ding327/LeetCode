package com.google.leetcode;

/**
 * Created by Ding on 2017/11/29.
 * https://leetcode.com/problems/add-binary/description/
 * 字符串二进制相加（默认字符串只包含01字符）
 */

public class AddBinarySolution {

    public static void main(String[] args) {
        String binary = addBinary("1111", "1111");
        System.out.println("结果是：" + binary);
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int lenA = a.length() - 1, lenB = b.length() - 1;
        int tempA = 0, tempB = 0, tempC = 0;
        while (lenA >= 0 || lenB >= 0) {
            if (lenA >= 0){
                tempA = a.charAt(lenA--) == '0' ? 0 : 1;
            }
            if (lenB >= 0){
                tempB = b.charAt(lenB--) == '0' ? 0 : 1;
            }
            if (tempA == tempB){
                sb.append(tempC);
                tempC = tempA == 1 ? 1 : 0;
            } else {
                sb.append(tempC == 0 ? 1 : 0);
            }
            tempA = tempB = 0;
        }

        if (tempC == 1){
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}
