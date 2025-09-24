package Reflect;

public class Cat {
    private String name;
    private int age;
    public static String color;
    public static String sex;

    public Cat() {
        System.out.println("无参构造器执行");
    }

    private Cat(String name, int age) {
        System.out.println("有参构造器执行");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public void run() {
        System.out.println("小猫跑得快");
    }

    public void eat() {
        System.out.println("小猫爱吃猫粮");
    }

    private String eat(String food) {
        return "小猫吃" + food;
    }
}
