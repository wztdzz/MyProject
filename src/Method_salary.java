public class Method_salary {
    public static void main(String[] args) {
    handlelate(25,8000);

    }
    public static int handlelate(int time, int Monthsarlary){
        System.out.println("迟到分钟数"+time);
        System.out.println("月薪"+Monthsarlary);
        int fakuan=0;
        double daythsarlary = (int)(Monthsarlary/22.5);
        if(time<10&time>0){
            System.out.println("警告！");
        }else if (time<21&time>10){
            System.out.println("罚款100");
            fakuan=100;
        }else if (time<31&time>20){
            System.out.println("罚款200");
            fakuan=200;
        }else if (time<61&time>30){
            System.out.println("罚半日工资");
            fakuan=(int)(daythsarlary/2);
        }else{
            System.out.println("罚1日工资");
            fakuan=(int)daythsarlary;
        }
        int sarlary=Monthsarlary-fakuan;
        System.out.println("剩余工资"+sarlary);
        return 0;
    }
}
