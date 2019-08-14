package com.mrk.test;

import java.util.Date;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class Test {
    public static void main(String[] args) {
        String a = "sasdfsdf";
        String b = "sadcsdvdsc";
        String c = "qweqweqwe";
        String d = " xghgngn";
        String e = "sasdawqweqwefsdf";
        String f = "dsdsd";
        String g = "sasdfuikiuoisdf";
        Date date1 = new Date();

        String key = a + b + c + d + e + f + g;
        Date date2 = new Date();

        StringBuilder sb2 = new StringBuilder(g + b + c + d + e + f + a);
        Date date3 = new Date();
        StringBuilder sb = new StringBuilder(a);
        sb.append(b);
        sb.append(c);
        sb.append(d);
        sb.append(e);
        sb.append(f);
        sb.append(g);
        Date date4 = new Date();
        System.out.println(date2.getTime() - date1.getTime());
        System.out.println(date3.getTime() - date2.getTime());
        System.out.println(date4.getTime() - date3.getTime());
        StringBuilder sbb = new StringBuilder("1234567");
        sbb.delete(sbb.length() - 1, sbb.length());
        System.out.println(sbb);

    }
}
