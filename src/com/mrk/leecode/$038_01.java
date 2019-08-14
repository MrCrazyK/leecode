package com.mrk.leecode;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $038_01 {
    public static void main(String[] args) {
        $038_01 test = new $038_01();
        test.countAndSay(5);

    }
    public String countAndSay(int n) {
        String str = "1";
        while (n > 1) {
            str = handle(str);
            n --;
        }
        return str;
    }
    public String handle(String str)  {
        StringBuilder result = new StringBuilder();
        int num = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) != str.charAt(i - 1)) {
                result.append(num).append(str.charAt(i - 1));
                num = 1;
            } else {
                num ++;
            }
        }
        return result.toString();
    }
}
