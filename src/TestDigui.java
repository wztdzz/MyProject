public class TestDigui {
    public static void main(String[] args) {
        System.out.println(jiecheng(6));
    }
    public static int jiecheng(int a){
        if (a==1){
            return 1;
        }else {
            return a*jiecheng(a-1);
        }

    }
}
