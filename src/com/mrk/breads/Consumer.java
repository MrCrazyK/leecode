package com.mrk.breads;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class Consumer extends Thread{


        //获得面包的类
        private Bread bre ;

        //set和get方法
        public Bread getBre() {
            return bre;
        }
        public void setBre(Bread bre) {
            this.bre = bre;
        }

        //继承重写run方法
        @Override
        public void run() {
            con();
        }

        //消费面包
        private void con() {
            // 与生产者保持一致，本系统默认循环生产20个面包（生产几个，消费几个）
            for(int i = 0;i<20;i++){
                try {
                    //沉睡0.3秒（演示效果需要，可以不加）
                    Thread.currentThread().sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //调用面包类里的生产面包的方法
                bre.consume();
            }
        }

        //有参构造
        public Consumer(Bread bre) {
            super();
            this.bre = bre;
        }

        //无参构造
        public Consumer() {
            super();
        }
}
