package com.itheima.demo;
public class dttest2 {
        public static void main(String[] args) {
/*          dttest c = new dttest();
            dtdemo a = new dttest();  // 多态*/
            dtdemo a = new dttest();
            a.show();
            a.ff();
            dttest c = new dttest();
            c.show();
            c.ff();
            c.catchMouse();

        }
    }

