package com.alibaba.codingstyle;

/**
 * User: lanxinghua
 * Date: 2019/6/20 17:10
 * Desc:
 */
public interface IUserService {
    default void aa(){
        System.out.println("aaa");
    }
}
