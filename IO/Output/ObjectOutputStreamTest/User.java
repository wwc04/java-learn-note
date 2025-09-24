package IO.Output.ObjectOutputStreamTest;

import java.io.Serializable;

public class User implements Serializable { //对象实现序列化必需实现序列化接口
    private String username;
    private transient  int age; //transient 可使成员变量不参加序列化
    private String sex;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User(String username, int age, String sex) {
        this.username = username;
        this.age = age;
        this.sex = sex;

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
