package com.airkisser.netty.entity;

import org.msgpack.annotation.Message;

import java.io.Serializable;

/**
 * Created by AIR on 2016/8/3.
 */
@Message
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -7382353070137128353L;

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[age="+age+", name='"+name+"']";
    }
}
