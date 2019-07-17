package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * User: lanxinghua
 * Date: 2019/7/17 14:03
 * Desc: lambda表达式对项目进行优化
 */
public class Test2 {

    public static void main(String[] args) {
        List<User> users1 = new ArrayList<>();
        User u = new User();
        u.setAge(0);
        u.setName("name");
        users1.add(u);
        //list进行转换
        List<User> users2 = users1.stream().map(Test2::userCVT).collect(Collectors.toList());
        System.out.println(users2);

    }

    public static User userCVT(User oldUser){
        User user = new User();
        if (oldUser != null){
            user.setName("name10");
            user.setAge(10);
        }
        return user;
    }
}

class User{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
