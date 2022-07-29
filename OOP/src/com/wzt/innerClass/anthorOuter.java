package com.wzt.innerClass;

public class anthorOuter {
    public static void main(String[] args) {
        Outer.Inner in =new Outer().new Inner();
        in.show();
    }
}
