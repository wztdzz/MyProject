package com.wzt;

//测试数组的拷贝

public class Test04 {
    public static void main(String[] args) {
        String[] ss = {"beijing", "shanghai", "shenzhen", "guangzhou", "hangzhou"};
        String[] s  = new String[6];
        System.arraycopy(ss,1,s,0,3);   //括号内依次是 源数组，原数组起始位置，待考入数组，待考入数组位置，考入数量

      for (int i =0;i<6;i++){
          System.out.println(s[i]);
      }
    }
}
