package com.itheima.demo;
public class staticdemotest {
        public static void main(String[] args) {
                staticdemo stu = new staticdemo();
            stu.name = "张三";
            stu.age = 13;
            staticdemo.country = "潍坊";
            staticdemo s = new staticdemo();
            s.name = "李四";
            s.age = 14;
            staticdemo.country = "烟台";
            System.out.println(stu.name);
            System.out.println(stu.age);
            //System.out.println(stu.country);
            System.out.println(staticdemo.country);
            staticdemo st = new staticdemo();
            st.country = "aa";
            System.out.println(st.country);
        }
    }
