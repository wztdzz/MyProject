package com.wzt.OOP;
//测试重写
 class che{
    public void run(){
        System.out.println("跑");
    }
    public che getche(){
        System.out.println("给你一个交通工具");
        return null;
    }
}

class horse extends che{
    @Override
    public void run() {
        System.out.println("马儿要跑了~  郭德纲郭德纲郭德纲郭德纲郭德纲郭德纲。。。");
    }

}

class plane extends che{
    @Override
    public che getche() {
        System.out.println("给你一个飞机");
        return null;
    }
}
public class TestOverride {
    public static void main(String[] args) {

        che c = new che();
        c.run();
        c.getche();

        che p =new plane();
        p.getche();
        che h = new horse();
        h.run();
    }
}



