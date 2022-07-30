package com.wzt;
//测试数组的几种初始化
public class Test02 {
    public static void main(String[] args) {


        //静态初始化
        int[] a ={112,51,45,5841,6116};
        Man[] mans ={new Man(1,10),new Man(13,84)};
        System.out.println(a[1]);
        System.out.println(mans[0].getId());

        //动态初始化即test01用循环赋值

        //默认初始化，即按照对象与属性赋初值，int赋0 引用类型赋null 布尔型赋false
        //数组也是对象，数组之于元素相当于对象之于属性
    }
}
