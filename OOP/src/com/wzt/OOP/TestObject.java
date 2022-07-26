package com.wzt.OOP;
//测试重写equals（），toStrings（）方法

import java.util.Objects;

public class TestObject {
    int id;
    String name;
    String sex;



    public  TestObject(int id, String name,String sex){
        this.id=id;
        this.name=name;
        this.sex=sex;
    }

    //重写toStrings（）方法
//    public String toString(){
//        return "账户名："+name+"性别："+sex+"号码"+id;
//    }

    //重写equals（）方法
//    @Override
//    public boolean equals(Object obj) {
//        if (this==obj) {
//            return true;
//        }
//        if (obj==null||getClass() != obj.getClass()) return false;
//        TestObject that = (TestObject) obj;
//        return id== that.id;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(sex, that.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex);
    }

    public static void main(String[] args) {
        TestObject t=new TestObject(101, "wzt", "nan");
        TestObject t1=new TestObject(101, "wz", "nan");

        System.out.println(t.toString());
        System.out.println(t1.toString());
        System.out.println(t.equals(t1));

    }




}
