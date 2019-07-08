package com.mrk;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $07_01 {
    public static void main(String[] args) {
        System.out.println(new $07_01().reverse(123));
        System.out.println(new $07_01().reverse(321));
        System.out.println(new $07_01().reverse(-321));
        System.out.println(new $07_01().reverse(2147483647));
        System.out.println(new $07_01().reverse(-2147483647));
    }
    public int reverse(int x) {
        String xStr = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        int end = 0;
        if (xStr.startsWith("-")) {
            end = 1;
            sb.append("-");
        }
        for (int i = xStr.length() - 1; i >= end; i--) {
            sb.append(xStr.charAt(i));
        }
        int result;
        try {
            result  = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }
}
