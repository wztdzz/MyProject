public class TestStatic {
    int id;
    String name;

    static String company = "尚学堂";
    static {                                                        //在加载类的时候就会被执行
        System.out.println("这里是，静态初始化块，执行类的初始化工作");
        company="java程序员";
        printCompsny();
    }

    public TestStatic(int id, String name){    //构造方法

        this.id=id;
        this.name=name;
    }

    public  void login(){             //普通方法
        System.out.println(name);
    }

    public static void printCompsny(){          //静态普通方法
//        login();//调用非静态成员，就会报错
        System.out.println(company);//company 已经定义了静态

    }

    public static void main(String[] args) {
        TestStatic u=new TestStatic(101,"ajs");
        TestStatic.printCompsny();
        TestStatic.company="alideyeye";
        TestStatic.printCompsny();
    }

}
