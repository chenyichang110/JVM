package com.atguigu.jvm.L08;

/**
 * 同步省略，锁消除 说明
 */
public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized (hollis) {
            System.out.println(hollis);
        }
    }
}
