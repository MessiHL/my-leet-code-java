package offer.m03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
## 03 数组中重复的数字
找出数组中重复的数字。
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：
输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3

限制：
2 <= n <= 100000
 */
public class FindRepeatNumber {

    // 最初级的思路：双循环
    public int solution1(int[] nums) {
        int ret = nums[0];
        for(int i = 1;i<nums.length;i++){
            for(int j = 1;j<nums.length;j++){
                if(nums[j] == ret){
                    break;
                }
            }
            ret = nums[i];
        }

        return ret;
    }

    /*
        思路2： 使用HashSet
        时间复杂度：O(n)O(n)：
            遍历数组一遍。使用哈希集合（HashSet），添加元素的时间复杂度为 O(1)O(1)，故总的时间复杂度是 O(n)O(n)。
        空间复杂度：O(n)O(n)：
            不重复的每个元素都可能存入集合，因此占用 O(n)O(n) 额外空间。
     */
    public int solution2(int[] nums){
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for(int num:nums){
            if(!set.add(num)){
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    /*
    https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/mian-shi-ti-03-shu-zu-zhong-zhong-fu-de-shu-zi-yua/
        方法三：原地交换
        遍历数组并通过交换操作，使元素的 索引 与 值 一一对应（即 nums[i] = inums[i]=i ）。
        因而，就能通过索引映射对应的值，起到与字典等价的作用
     */
    public int solution3(int[] nums){
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            System.out.println(Arrays.toString(nums));
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }
}
