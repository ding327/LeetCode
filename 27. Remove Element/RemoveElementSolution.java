/**
 * Created by Ding on 2017/10/24.
 * https://leetcode.com/problems/remove-element/description/
 * 题意：给出一个整形数组和目标值，删除整形数组中所有的目标值，最后返回数组的新长度
 * 要求：不能重新分配新的数组空间
 * 
 * 题目有歧义，leetcode有好多个类似歧义的问题，最后数组的长度没有改变，仅仅是删除了所有出现的目标值，返回的是删除后剩余的元素个数
 */

public class RemoveElementSolution {
    public static int removeElement(int[] nums, int val) {
        int num = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[num++] = nums[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arrs = {2, 3, 2, 3, 5, 6, 8, 2, 3, 7, 5, 6, 7};
        int num = removeElement(arrs, 5);
        System.out.println("结果是：" + num);
        System.out.println(Arrays.toString(arrs));
    }
}
