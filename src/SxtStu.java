public class SxtStu {
    public static class Stu{
        int id;
        int age;
        String sanme;

        public void study(){
            System.out.println("study");
        }
        public void play(){
            System.out.println("play");
        }
    }
    public static void main(String[] args) {
        Stu s1=new Stu();
        System.out.println(s1.id);
        s1.id=22;
        System.out.println(s1.id);
    }

}