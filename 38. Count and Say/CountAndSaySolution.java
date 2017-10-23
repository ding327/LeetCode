/**
 * Created by Ding on 2017/10/23.
 * http://blog.csdn.net/makuiyu/article/details/43541027
 * 英文不好理解。大概意思就是返回对应层级的数字：相当于口语话数字，例如1211--> 1个1 + 1个2 + 2个1 --> 去除文字：111221
 1
 11
 21
 1211
 111221
 312211
 13112221
 1113213211
 31131211131221
 13211311123113112211
 11131221133112132113212221
 3113112221232112111312211312113211
 1321132132111213122112311311222113111221131221
 11131221131211131231121113112221121321132132211331222113112211
 311311222113111231131112132112311321322112111312211312111322212311322113212221
 */

public class CountAndSaySolution {
    public static String countAndSay(int n) {

        String str = "1";
        for (int i = 1; i < n; i++) {
            int count = 1;
            String tem = "";
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    count++;
                } else {
                    tem = tem + count + str.charAt(j - 1);
                    count = 1;
                }
            }
            str = tem + count + str.charAt(str.length() - 1);
        }
        return str;
    }

    public static void main(String[] args) {
        String str = countAndSay(4);
        System.out.println("结果是：" + str);
    }
}
