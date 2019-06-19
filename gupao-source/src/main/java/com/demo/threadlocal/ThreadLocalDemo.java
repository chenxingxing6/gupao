package com.demo.threadlocal;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.concurrent.TimeUnit;

/**
 * User: lanxinghua
 * Date: 2019/6/18 11:40
 * Desc: 数据结构，有点像hashMap,但只能存一个，线程数据互相不干扰
 */
public class ThreadLocalDemo {
    public static void main(String[] args) {
     /*   final ThreadLocal<String> threadLocal1 = new ThreadLocal<String>();
        final ThreadLocal<Integer> threadLocal2 = new ThreadLocal<Integer>();*/
        //自定义threadLocal
        final MyThreadLocal<String> threadLocal1 = new MyThreadLocal<String>();
        final MyThreadLocal<Integer> threadLocal2 = new MyThreadLocal<Integer>();

        new Thread(new Runnable() {
            public void run() {
                threadLocal1.set("A");
                threadLocal2.set(1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
                System.out.println(threadLocal1.get());
                System.out.println(threadLocal2.get());
            }
        }).start();


        new Thread(new Runnable() {
            public void run() {
                threadLocal1.set("B");
                threadLocal2.set(2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
                System.out.println(threadLocal1.get());
                System.out.println(threadLocal2.get());
            }
        }).start();


        new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println(threadLocal1.get());
                System.out.println(threadLocal2.get());
            }
        }).start();
    }
}
