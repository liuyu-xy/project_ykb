package com.itheima.demo.笔记;
import com.itheima.demo.publicjc;
public class jcdemo1 extends publicjc {
    public static void main(String[] args) {
    }
    public jcdemo1(String myName, int myid) {
        super("猫", 1);
    }
    public void eat(){
        String name = "";
        System.out.println(name+"正在吃");
    }
    public void introduction(){
        String id = "";
        String name="";
        System.out.println("这是"+id+"号"+"它是"+name);
    }
}