package com.mrk.breads;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class ManyBreads {


        public static void main(String[] args) {

            //new一个面包类
            Bread bre = new Bread();

            //new一个生产者类
            Producer proth = new Producer(bre);
            //new一个消费者类
            Consumer conth = new Consumer(bre);

            //new三个包含消费者类的线程
            Thread t1 = new Thread(proth,"生产者1");
            Thread t3 = new Thread(proth,"生产者2");
            Thread t5 = new Thread(proth,"生产者3");

            //new三个包含生产者类的线程
            Thread t2 = new Thread(conth,"消费者1");
            Thread t4 = new Thread(conth,"消费者2");
            Thread t6 = new Thread(conth,"消费者3");

            //启动线程
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t6.start();
        }
}
