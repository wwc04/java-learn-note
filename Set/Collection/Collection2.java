package JiHe.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

//Collection单列集合的遍历方式
public class Collection2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");

        //迭代器结合循环遍历结合
        Iterator<String> it = c.iterator(); //it首先在集合的第一个元素处，取出元素后向后移一位，直到返回值为false结束while循环
        while (it.hasNext()) {
            /*String ele = it.next();
            System.out.print(ele);*/
            System.out.print(it.next());
        }

        System.out.println();
        System.out.println("--------------------------------------------------");

        //增强for循环（既能遍历集合又能遍历数组）
        for (String ele : c) { // 形式： for（元素的数据类型 变量名 : 数组或者集合）
            System.out.print(ele);
        }

        System.out.println();
        System.out.println("--------------------------------------------------");

        //Lambda表达式
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
            }
        });

        System.out.println();
        System.out.println("--------------------------------------------------");

        //简化
        c.forEach((String s) -> {
            System.out.print(s);
        });

        System.out.println();
        System.out.println("--------------------------------------------------");

        //再简化
        c.forEach(s -> {
            System.out.print(s);
        });

        System.out.println();
        System.out.println("--------------------------------------------------");

        //再再简化
        c.forEach(s -> System.out.print(s));

        System.out.println();
        System.out.println("--------------------------------------------------");

        //再再再简化
        c.forEach(System.out::print);
    }
}
