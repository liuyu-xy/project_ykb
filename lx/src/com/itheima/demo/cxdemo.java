package com.itheima.demo;
public abstract class cxdemo {
    public void show(){
        System.out.println("11");
    }
    public abstract void ff();
}
class Cat extends cxdemo{
    public void ff(){
        System.out.println("123");
    }
}