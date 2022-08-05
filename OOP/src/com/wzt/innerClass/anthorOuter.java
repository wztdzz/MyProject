package com.wzt.innerClass;

public class anthorOuter {
    public static void main(String[] args) {
        Outer.Inner in =new Outer().new Inner();//这样才创建了inner对象
        in.show();
    }
}
