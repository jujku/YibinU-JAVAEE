package com.dao;

public class UserDaoImpl implements UserDao{
    private String id;
    private String name;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void say(){
        System.out.println("我是" + name + "我的id是" + id + "by say()");
    }

    public String toString(){
        return "我是" + name + "我的id是" + id + "by toString()";
    }
}
