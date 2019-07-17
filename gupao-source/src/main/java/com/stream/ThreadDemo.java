package com.stream;

/**
 * User: lanxinghua
 * Date: 2019/7/17 10:42
 * Desc:
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 命令式编程
        Object target1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("新建一个线程"+Thread.currentThread().getName());
            }
        };
        new Thread((Runnable) target1).start();

        // 函数式编程
        Object target2 = (Runnable)() -> System.out.println("新建一个线程" + Thread.currentThread().getName());
        new Thread((Runnable) target2).start();
    }
}
