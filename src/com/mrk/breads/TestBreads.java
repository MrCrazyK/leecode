package com.mrk.breads;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class TestBreads {




        public static void main(String[] args) {

            //new一个面包类
            Bread bre = new Bread();

            //new一个生产者类
            Producer proth = new Producer(bre);
            //new一个消费者类
            Consumer conth = new Consumer(bre);

            //new一个包含消费者类的线程
            Thread t1 = new Thread(proth,"生产者");

            //new一个包含生产者类的线程
            Thread t2 = new Thread(conth,"消费者");

            //启动线程
            t1.start();
            t2.start();

        }
}
