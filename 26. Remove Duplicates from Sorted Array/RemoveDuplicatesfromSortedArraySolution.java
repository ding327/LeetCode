/**
 * Created by Ding on 2017/10/23.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * 给定一个已排序的数组，删除重复的元素，这样每个元素只出现一次，并且返回新的数组长度。 
 * 不允许为另一个数组使用额外的空间，你必须就地以常量空间执行这个操作。 
 * 例如， 给定输入数组为 [1,1,2] 你的函数应该返回length = 2， 其前两个元素分别是1和2。
 */

public class RemoveDuplicatesfromSortedArraySolution {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n < 2) return n;
        int id = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[id++] = nums[i];
            }
        }
        return id;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        int num = removeDuplicates(nums);
        System.out.println("结果：" + num);
    }
}
