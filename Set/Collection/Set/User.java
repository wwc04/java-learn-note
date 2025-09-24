package JiHe.Collection.Set;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;
    private double height;

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ",age=" + age +
                ", height=" + height +
                '}';
    }
    @Override
    public int compareTo(User o) { //自定义排序（此比较器为年龄升序）
        return this.age - o.age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Double.compare(height, user.height) == 0 && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    public User() {
    }

    public User(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}