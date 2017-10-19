/**
 * Created by Ding on 2017/10/18.
 * https://leetcode.com/problems/valid-parentheses/description/
 * 只包含"(", ")" , "{", "}", "[", "]"的字符串，判断其是否合法：符号必须是正确的顺序，"()"、"(){}[]"是合法的，"(]"或者"([)]"是不合法的
 * 注意: {[()]}类似这种是合法的，是个坑
 */

public class ValidParenthesesSolution {

    public static boolean isValid(String s) {
        int length;
        do {
            length = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while (length != s.length());

        return s.length() == 0;
    }

    public static void main(String[] args) {
        boolean valid = isValid("()[]{[()]}{}");
        System.out.println("结果是：" + valid);
    }
}
