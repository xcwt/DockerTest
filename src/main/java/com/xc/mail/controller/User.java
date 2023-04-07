package com.xc.mail.controller;




/**
 * @Author：zwt
 * @Project：DockerTest
 * @Date：2023/4/7 10:47
 * @Filename：User
 */

public class User {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
