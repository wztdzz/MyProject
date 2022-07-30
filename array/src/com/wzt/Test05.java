package com.wzt;

//测试Arrays类
import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {
        int[]a = {1,2,12,3,543,8,688,641};
        System.out.println(a);
        System.out.println(Arrays.toString(a)); //显示数组
        Arrays.sort(a);                         //数组排序
        System.out.println(Arrays.toString(a));
        int s =Arrays.binarySearch(a,12);//查找元素 有则返回位置 没有返回负数
        System.out.println(s);
        Arrays.fill(a,2,4,50);
        System.out.println(Arrays.toString(a));

    }
}
