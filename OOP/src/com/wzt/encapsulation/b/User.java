package com.wzt.encapsulation.b;

public class User {
    private int id;
    private  String name;
    private boolean man;

    public User(int id, String name, boolean man) {
        this.id = id;
        this.name = name;
        this.man = man;
    }

    public void printUserinfo(){
        System.out.println(id);
        System.out.println(name);
    }

    public int getId() {   //get获得直
        return id;
    }

    public void setId(int id) {    //set设置值
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMan() {  //boolean类型的get是is开头
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
