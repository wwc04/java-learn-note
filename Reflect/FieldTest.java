package Reflect;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Field;

//获取类的成员变量
public class FieldTest {
    private static final Logger log = LoggerFactory.getLogger(FieldTest.class);

    @Test
    public void testGetField() throws Exception {
        Class c = Cat.class;
        Field[] f = c.getFields(); //获取类的全部成员变量(只能获取public修饰的)
        for (Field field : f) {
            System.out.println(field.getName());
        }

        Field f2 = c.getField("sex"); //获取指定的成员变量（只能获取public修饰的）
        System.out.println(f2.getName() + "---->" + f2.getType());

        Field[] fields = c.getDeclaredFields(); //获取类的全部成员变量
        for (Field field2 : fields) {
            System.out.println(field2.getName());
        }

        Field fName = c.getDeclaredField("name"); //获取指定属性
        System.out.println(fName.getName() + "---->" + fName.getType()); //输出属性名及属性类型

        Field fAge = c.getDeclaredField("age");
        System.out.println(fAge.getName() + "---->" + fAge.getType());

        //赋值
        Cat cat = new Cat();
        fName.setAccessible(true);
        fAge.setAccessible(true);
        fName.set(cat, "咖啡猫");
        fAge.set(cat, 5);
        System.out.println(cat);

        //取值
        String name = (String) fName.get(cat);
        int age = (int) fAge.get(cat);
        System.out.println(name + "---->" + age);
    }
}
