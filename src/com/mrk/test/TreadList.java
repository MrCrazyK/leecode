package com.mrk.test;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class TreadList {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Thread tread1 = new Thread(){
            @Override
            public void run() {
                for (String str : list) {
                    System.out.println(str);
                }
            }
        };
        Thread tread2 = new Thread(){
            @Override
            public void run() {
                for (String str : list) {
                    if (str.equals("3")){
                        list.remove(str);
                    }
                }
            }
        };

        tread1.start();
        tread2.start();

    }
}
