package com.mrk.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $017_01 {
    public static void main(String[] args) {
        $017_01 TEST = new $017_01();
        TEST.sout(TEST.letterCombinations("23456789"));
    }
    public static String[][] ch = {{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},
            {"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
    public List<String> letterCombinations(String digits) {
        String[] result = push(null, digits, 0);
        if (result != null) {
            return Arrays.asList(result);
        } else {
            return new ArrayList<>();
        }

    }
    public String[] push(String[] ori, String str, int index){
        if (index >= str.length()) {
            return ori;
        } else {
            int a = (int)str.charAt(index ++) - 50;
            if (ori == null) {
                return push(ch[a], str, index);
            } else {
                String[] result = new String[ori.length * ch[a].length];
                int temp = 0;
                for (int i = 0; i < ori.length; i++) {
                    for (int j = 0; j < ch[a].length; j++) {
                        result[temp ++] = ori[i] + ch[a][j];
                    }
                }
                return push(result, str, index);
            }
        }
    }


    public void sout(List<String> list) {
        list.forEach(System.out::println);
    }


}
