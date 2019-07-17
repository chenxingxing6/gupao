package com.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * User: lanxinghua
 * Date: 2019/7/17 09:58
 * Desc: java8 Stream
 * Predicate     断言
 * Consumer      消费
 * Function<T,R> 输入T,输出R
 */
public class Test1 {
    public static void main(String[] args) {
        //断言函数接口
        Predicate predicate = str -> {
            return str.equals("aa");
        };
        System.out.println(predicate.test("aa"));

        // 消费函数接口
        Consumer<String> consumer = s -> {
            System.out.println(s);
        };
        consumer.accept("参数");
    }
}
