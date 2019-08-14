package com.mrk.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $022_01 {
    public static void main(String[] args) {

        $022_01 TEST = new $022_01();
        TEST.generateParenthesis(3).forEach(System.out::println);
    }

    /**
     * 思路:
     *  1.左括号的个数不大于n
     *  2.如果右括号的个数 小于 左括号的个数 则可以出现分支
     *
     *  最终结果左括号用1 右括号用0 表示
     *
     *  我的解法是生成符合条件的开头
     *  以4举例
     *      类似1111 101011
     *      之后补齐后面的0
     *  那么开头 就应该在 1111到1110001之间
     *  即 1<<n - 1 和 1<< (n-1) << n + 1
     */

    public List<String> generateParenthesis(int n) {
        List <String> resultList = new ArrayList<>();
        int min = (1 << n) - 1;
        int max = ((1 << n-1) - 1 << n) + 2;
        for (int i = min; i < max; i++) {
            int left = 0;
            int deep = 0;
            String twoForm = Integer.toString(i, 2);
            char[] chars = twoForm.toCharArray();
            if (i != min && i != max) {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == '1'){
                        deep ++;
                        left ++;
                    } else {
                        deep --;
                    }
                    if (deep < 0 || left > n) {
                        break;
                    }
                }
            } else {
                left = n;
            }
            if (left == n && chars[chars.length -1] != '0'){
                System.out.println(twoForm);
                resultList.add(chars2String(chars, n));
            }
        }
        return resultList;
    }
    //二进制chars换成括号
    public String chars2String(char[] chars, int n) {
        //满足条件就将二进制转换成字符串
        char[] result = new char[2 * n];
        for (int j = 0; j < 2 * n; j++) {
            if (j < chars.length && chars[j] == '1') {
                result[j] = '(';
            } else {
                result[j] = ')';
            }
        }
        return new String(result);
    }

}
