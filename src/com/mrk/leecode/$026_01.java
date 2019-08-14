package com.mrk.leecode;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $026_01 {
    public static void main(String[] args) {
        $026_01 test = new $026_01();
        int[] arr1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(test.removeDuplicates(arr1));
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]+"..");
        }
    }
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index ++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}
