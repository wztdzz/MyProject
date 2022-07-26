
//测试构建方法重载

public class User {
    int id;
    String name;
    String pwd;


    public User(){

    }

    public User(int id,String name){
        this.id=id;
        this.name=name;
    }


    public User(int id){
        this.id=id;
    }

    public static void main(String[] args) {
        User u=new User();
        User u1=new User(111,"wzt");

    }

}
