public class Person {

    String name;
    int age;


    public void show(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person a = new Person();
        a.age =18;
        a.name = "wzt";
        a.show();
        Person b = new Person();
        b.age = 22;
        b.name ="xf";
        b.show();

        Person c = a;
        Person d = a;
        d.age = 35;
        System.out.println(a.age);

        }
}

