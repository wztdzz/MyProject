package com.wzt;

public class Test01 {
    public static void main(String[] args) {
//        int [] s= new int [10] ;
//        for(int i=0;i<10;i++)
//        {
//            s[i]=2*i+1;
//            System.out.println(s[i]);
//        }

    Man[] mans =new Man[10];

    Man m1 = new Man(1,11);
    Man m2 = new Man(2,22);
    mans[0]=m1;
    mans[1]=m2;
        System.out.println(m1.getAge());
        System.out.println(m2.getId());

    }
}

class Man{
    private int age;
    private  int id;
    public Man(int id,int age){
        super();
        this.age=age;
        this.id =id;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
