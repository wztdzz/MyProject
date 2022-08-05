package com.wzt;

public class Test06 {
    public static void main(String[] args) {
        Emp[] emps={
                new Emp(1,"",15,"worker",""),
                new Emp(2,"",19,"boss",""),
                new Emp(3,"",17,"doctor",""),
                new Emp(4,"",13,"driver","")
        } ;
        for(Emp e:emps){
            System.out.println(e);
        }
    }
}

class Emp{
    private int id;
    private String name;
    private int age;
    private String job;
    private String hiretime;

    public Emp(int id, String name, int age, String job, String hiretime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.hiretime = hiretime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHiretime() {
        return hiretime;
    }

    public void setHiretime(String hiretime) {
        this.hiretime = hiretime;
    }

}





