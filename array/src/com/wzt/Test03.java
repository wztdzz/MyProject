package com.wzt;

public class Test03 {
    public static void main(String[] args) {
        String [] ss ={"beijing","shanghai","shenzhen","guangzhou","hangzhou"};
        for(int i=0;i<ss.length;i++){
            System.out.println(ss[i]);
        }

        //只用于简单的读取数组中的内容
        for(String t: ss){
            System.out.println(t);
        }
    }
}
