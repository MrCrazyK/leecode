package com.mrk.test;

import java.util.concurrent.Future;

/**
 * TODO
 *
 * @author 王一鸣
 */
public interface RunnableFuture<V> extends Runnable, Future<V> {

    void run();

}
