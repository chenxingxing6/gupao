package com.alibaba.codingstyle.impl;

import com.alibaba.codingstyle.IUserService;

/**
 * User: lanxinghua
 * Date: 2019/6/20 17:11
 * Desc:
 */
public class UserService implements IUserService {

    public static void main(String[] args) {
        IUserService userService = new UserService();
        userService.aa();
    }
}
