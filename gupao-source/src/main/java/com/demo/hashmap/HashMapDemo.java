package com.demo.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * User: lanxinghua
 * Date: 2019/3/29 13:06
 * Desc:
 */
public class HashMapDemo {
    public static void main(String[] args) {

        int oldCapacity = 16;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        System.out.println(newCapacity);
    }
}
