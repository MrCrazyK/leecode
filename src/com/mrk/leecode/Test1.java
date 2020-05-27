package com.mrk.leecode;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(1 & 1);
        System.out.println(0 & 0);
        System.out.println(1 & 0);
        System.out.println(1 | 1);
        System.out.println(0 | 0);
        System.out.println(1 | 0);
        System.out.println(1 ^ 1);
        System.out.println(0 ^ 0);
        System.out.println(1 ^ 0);
        int[] nums = new int[]{2,2,1};
        System.out.println(new Test1().singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1;i < nums.length;i ++){
            res = res ^ nums[i];
        }
        return res;
    }
}
