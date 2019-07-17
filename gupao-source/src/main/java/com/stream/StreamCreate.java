package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * User: lanxinghua
 * Date: 2019/7/17 13:43
 * Desc: stream流创建方法
 */
public class StreamCreate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        // 1.集合创建
        list.stream();
        list.parallelStream();

        // 2.数组创建
        Arrays.stream(new int[] {1, 2, 3});

        // 3.数字流
        Stream.of(1, 2, 3);
        Stream.of("1", "2", "3");

        // 4.random创建流
        // 5.自己产生流
        Stream.generate(() -> new Random().nextInt()).limit(20);

    }
}
