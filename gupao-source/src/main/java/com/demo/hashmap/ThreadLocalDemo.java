package com.demo.hashmap;

/**
 * User: lanxinghua
 * Date: 2019/6/18 11:40
 * Desc: 数据结构，有点像hashMap,但只能存一个，线程数据互相不干扰
 */
public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<String>();
        local.set("aa");
        System.out.println(local.get());
    }
}
