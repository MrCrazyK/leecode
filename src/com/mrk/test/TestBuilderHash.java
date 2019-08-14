package com.mrk.test;

import java.util.List;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class TestBuilderHash {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String a = null;
        String b = null;
        String c = null;
        String d = null;
        sb.append(a);
        sb.append(b);
        sb.append(c);
        sb.append(d);
        System.out.println(sb.toString().hashCode());

    }
}
