package com.mrk.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $013_01 {
    public static void main(String[] args) {
        $013_01 TEST = new $013_01();
        System.out.println(TEST.romanToInt("III") == 3);
        System.out.println(TEST.romanToInt("IV") == 4);
        System.out.println(TEST.romanToInt("IX") == 9);
        System.out.println(TEST.romanToInt("LVIII") == 58);
        System.out.println(TEST.romanToInt("MCMXCIV") == 1994);
    }
    
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        int last = 0;
        int current;
        for (int i = 0; i < s.length(); i++) {
            current = map.get(s.charAt(i));
            if (current > last) {
                sum -= last;
            } else {
                sum += last;
            }
            last = current;
        }
        sum += last;
        return sum;
    }

}
