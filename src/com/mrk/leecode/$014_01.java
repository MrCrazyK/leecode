package com.mrk.leecode;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $014_01 {
    public static void main(String[] args) {
        $014_01 TEST = new $014_01();
        String[] arr = {"flower","flow","flight"};
        System.out.println(TEST.longestCommonPrefix(arr));
        String[] arr2 = {"dog","racecar","car"};
        System.out.println(TEST.longestCommonPrefix(arr2));
        String[] arr3 = {"aa","a"};
        System.out.println(TEST.longestCommonPrefix(arr3));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        if (strs.length == 1){
            return strs[0];
        }
        int num = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (!(num < strs[i].length())){
                num = strs[i].length();
            }
            for (int j = 0; j < num; j++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    num = j;
                    break;
                }
            }
        }
        return strs[0].substring(0,num);
    }
}
