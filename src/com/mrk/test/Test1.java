package com.mrk.test;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class Test1 {
    public static void main(String[] args) {

        Thread tread1 = new MyThread();
        tread1.setName("线程1");
        Thread tread2 = new MyThread();
        tread2.setName("线程2");
        tread1.start();
        tread2.start();

        MyRunnable tread3 = new MyRunnable();
        tread3.run();

        MyCallable thread4 = new MyCallable();
        thread4.call();

        FutureTask thread5 = new FutureTask();
        thread5.run();

    }
}
class MyThread extends Thread {
    private final ReentrantLock mainLock = new ReentrantLock();
    @Override
    public void run() {
        try {
            mainLock.lock();
            for (int i = 0; i < 100; i++) {
                    System.out.println(this.getName()+ "---" + i);
                    sleep(100);
            }
            mainLock.unlock();
        } catch (InterruptedException e) {
            System.out.println("catch");
        }

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
                sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("catch");
        }

    }
}
class MyCallable implements Callable<Integer> {
    private int i = 0;

    // 与run()方法不同的是，call()方法具有返回值
    @Override
    public Integer call() {
        int sum = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            sum += i;
        }
        return sum;
    }

}


