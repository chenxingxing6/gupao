package com.demo.threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * User: lanxinghua
 * Date: 2019/6/19 19:35
 * Desc: 自定义ThreadLocal
 */
public class MyThreadLocal<T> {
    private Map<Thread/*线程*/, T/*对象*/> valueMap = Collections.synchronizedMap(new HashMap<Thread, T>());

    //get
    public T get(){
        Thread thread = Thread.currentThread();
        T t = valueMap.get(thread);
        if (t == null && !valueMap.containsKey(thread)){
            t = init();
            valueMap.put(thread, t);
        }
        return t;
    }


    //set
    public void set(T value){
        valueMap.put(Thread.currentThread(), value);
    }

    //init
    public T init(){
        return null;
    }

    //remove
    public void remove(){
        valueMap.remove(Thread.currentThread());
    }
}
