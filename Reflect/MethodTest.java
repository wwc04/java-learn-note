package Reflect;

import org.junit.Test;
import java.lang.reflect.Method;

//获取类的成员方法
public class MethodTest {
    @Test
    public void testMethod() throws Exception {
        Class c = Cat.class;
        Method[] methods = c.getDeclaredMethods(); //获取类的全部方法对象
        for (Method method : methods) { //遍历方法对象
            System.out.println(method.getName() + "---->"
                    + method.getParameterCount() + "---->"
                    + method.getReturnType());
        }

        Method run = c.getDeclaredMethod("run"); //获取指定方法对象
        System.out.println(run.getName() + "---->"
                + run.getParameterCount() + "---->"
                + run.getReturnType());

        Method eat = c.getDeclaredMethod("eat", String.class);
        System.out.println(eat.getName() + "---->"
                + eat.getParameterCount() + "---->"
                + eat.getReturnType());

        Cat cat = new Cat();
        run.setAccessible(true);
        Object rs = run.invoke(cat); //触发某个对象的该方法执行，可获取方法的参数和返回值
        System.out.println(rs);

        eat.setAccessible(true);
        Object rs1 = eat.invoke(cat, "猫粮");
        System.out.println(rs1);

    }
}
