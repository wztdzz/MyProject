public class TestOverload {
    public static void main(String[] args) {

    }

//    测试方法重载  只有形参个数类型不同顺序则可以构成重载
    public  static int OverLoad(){
        return 0;
    }
    public  static int OverLoad(int a){
        return 0;
    }
    public  static int OverLoad(int a,int b){
        return 0;
    }
    public  static int OverLoad(int a,double b){
        return 0;
    }
}
