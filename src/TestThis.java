public class TestThis {      //类
    int a,b,c;

    TestThis(){                 //构造器
        System.out.println("正要初始化对象："+this);
    }

    TestThis(int a,int b){
        this();
        a=a;


        this.a=a;
        this.b=b;
    }


    TestThis(int a,int b,int c){
        this(a,b);
        this.c=c;
    }

    void sing(){

    }
    void eat(){
        System.out.println("当前对象："+this);
        this.sing();
        System.out.println("吃饭");
    }


    public static void main(String[] args) {
        TestThis hi = new TestThis(2,3);


    }
}
