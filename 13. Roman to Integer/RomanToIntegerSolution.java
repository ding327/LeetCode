/**
 * Created by Ding on 2017/10/17.
 * https://leetcode.com/problems/roman-to-integer/description/
 * 将输入的罗马数字转换成整型数字，罗马数字限制在1~3999。
 */

public class RomanToIntegerSolution {
    public static int romanToInt(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    res += (res >= 5 ? -1 : 1);
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += 10 * (res >= 50 ? -1 : 1);
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    res += 100 * (res >= 500 ? -1 : 1);
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int dcxxi = romanToInt("DCXXI");
        System.out.println("结果是：" + dcxxi);
    }
}
