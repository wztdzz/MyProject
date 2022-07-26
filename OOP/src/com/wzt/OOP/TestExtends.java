package com.wzt.OOP;
//测试继承
public class TestExtends {
    public static void main(String[] args) {
        student s = new student("wzt",180,"compuer");
        boy b= new boy("男");
        System.out.println(s instanceof person);
        System.out.println(b instanceof person);
    }

}
class  person extends Object{
    String name;
    int height;
    public void rest(){
        System.out.println("休息");
    }
}
class student extends person{
    String majior;
    public void study(){
        System.out.println("学习");
        rest();
        System.out.println(this.name);

    }
    public student(String name,int hight,String majior) {
        this.name=name;
        this.majior=majior;
        this.height=hight;
    }



}
class boy extends person{
    String sex;

    public boy( String sex){
        this.sex=sex;
        System.out.println(this.sex);
    }

}
