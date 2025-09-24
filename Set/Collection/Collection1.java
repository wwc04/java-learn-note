package JiHe.Collection;

import java.util.ArrayList;
import java.util.Arrays;

//Colleaion单列集合的常用方法
public class Collection1 {
    public static void main(String[] args) {
        java.util.Collection<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("b");
        System.out.println(c);

        //判断集合中是否包含元素
        System.out.println(c.contains("a"));

        //集合长度
        System.out.println(c.size());

        //删除指定的集合中的元素,没有返回false，删除成功返回true
        System.out.println(c.remove("a"));
        System.out.println(c);

        //将集合妆化为数组
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));
        String[] arr2 = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(arr2));

        //清空集合中的元素
        c.clear();
        System.out.println(c);

        //判断集合是否为空
        System.out.println(c.isEmpty());

        System.out.println("---------------------------------------------------------");

        //把一个集合的全部数据倒入到另一个集合中
        java.util.Collection<String> c1 = new ArrayList<>();
        c1.add("q");
        c1.add("w");
        c1.add("e");
        c1.add("r");
        java.util.Collection<String> c2 = new ArrayList<>();
        c2.add("j");
        c2.add("a");
        c2.add("v");
        c2.add("a");
        c1.addAll(c2); //将集合c2的全部数据倒入到集合c1中去
        System.out.println(c1);
    }
}
