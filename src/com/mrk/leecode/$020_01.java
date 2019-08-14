package com.mrk.leecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $020_01 {
    public static void main(String[] args) {
        System.out.println(new $020_01().isValid("[]{}"));
    }
    private static final Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('{','}'); put('[',']'); put('(',')');
    }};
    public boolean isValid(String s) {
        if(s.length() > 0 && !map.containsKey(s.charAt(0))){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(stack.isEmpty() || map.containsKey(c)) {
                //栈为空或map含有此key则新增元素(保证增加的是三种key)
                stack.push(c);
            } else if (map.get(stack.peek()) == c) {
                //如果栈尾和此元素配对则新增
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
