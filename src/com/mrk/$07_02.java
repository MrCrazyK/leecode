package com.mrk;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $07_02 {
    public static void main(String[] args) {
        System.out.println(new $07_02().reverse(123));
        System.out.println(new $07_02().reverse(321));
        System.out.println(new $07_02().reverse(-321));
        System.out.println(new $07_02().reverse(2147483647));
        System.out.println(new $07_02().reverse(-2147483647));
    }
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
