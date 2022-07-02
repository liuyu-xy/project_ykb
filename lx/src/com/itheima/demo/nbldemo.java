package com.itheima.demo;
public class nbldemo {
        int age = 20;
        public class nbl{//内部类 方法内部的类
            int a = 10;
            public void show(){
                System.out.println(age);
            }
        }
        public void ff(){
            System.out.println(new nbl().a);
        }
    }


