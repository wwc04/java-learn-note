package Reflect;

import org.junit.Test;
import java.lang.reflect.Constructor;

//获取类的构造器
public class ConstructorTest {
    @Test
    public void testGetConstructor() throws Exception {
        Class c = Cat.class; // 获取Cat类的Class对象


        Constructor constructor = c.getDeclaredConstructor(); // 获取无参构造器
        System.out.println(constructor.getName() + "---->" + constructor.getParameterCount()); // 获取构造器的名称和参数个数
        constructor.setAccessible(true); // 暴力访问, 忽略访问权限修饰符
        Cat cat = (Cat) constructor.newInstance(); // 通过无参构造器创建对象
        System.out.println(cat);

        Constructor constructor1 = c.getDeclaredConstructor(String.class, int.class); // 获取有参构造器
        System.out.println(constructor1.getName() + "---->" + constructor1.getParameterCount());
        constructor1.setAccessible(true);
        Cat cat2 = (Cat) constructor1.newInstance("Tom", 4);
        System.out.println(cat2);

        Constructor[] constructors = c.getDeclaredConstructors(); // 获取所有构造器
        for (Constructor constructor3 : constructors) {
            System.out.println(constructor3.getName() + "---->" + constructor3.getParameterCount()); // 获取构造器的名称和参数个数
        }

    }
}
