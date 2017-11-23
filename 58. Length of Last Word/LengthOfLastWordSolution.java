/**
 * https://leetcode.com/problems/length-of-last-word/description/
 * 返回最后一个单词的长度，单词间以空格区分。
 */

public class LengthOfLastWordSolution {
    public static int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }

    public static void main(String[] args){
        int result = lengthOfLastWord("hello world");
        System.out.println("结果是：" + result);
    }
}
