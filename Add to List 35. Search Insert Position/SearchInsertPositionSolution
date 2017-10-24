/**
 * Created by Ding on 2017/10/24.
 * https://leetcode.com/problems/search-insert-position/description/
 * 给出一个已排序的整形数组和一个目标值，如果目标值存在则找到目标值的下标，不存在则返回目标值应该处于数组的位置。
 * example：
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0
 */

public class SearchInsertPositionSolution {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int index = searchInsert(nums, 0);
        System.out.println("结果是：" + index);
    }
}
