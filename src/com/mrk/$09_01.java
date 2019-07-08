package com.mrk;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $09_01 {
    public static void main(String[] args) {
        System.out.println(new $09_01().isPalindrome(1234321));
    }
    public boolean isPalindrome(int x) {
        boolean result = true;
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String a = String.valueOf(x);
        int num = a.length() / 2 +1;
        for (int i = 0; i < num; i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }

}
