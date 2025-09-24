package JiHe.Collection.List;

import java.util.ArrayList;
import java.util.List;

//List集合的方法（支持索引）
public class Collection_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("q");
        list.add("w");
        list.add("r");

        //指定索引插入元素
        list.add(2, "e");
        System.out.println(list);

        //获取指定索引的元素
        System.out.println(list.get(0));

        //修改索引位置的元素
        list.set(0, "a");
        System.out.println(list.set(0, "a")); //修改成功返回被修改的元素
        System.out.println(list);

        //删除指定索引的元素
        System.out.println(list.remove(3)); //删除成功返回被删除的元素
        System.out.println(list);

        System.out.println();
        System.out.println("----------------------------------------------------");

        //遍历方法(迭代器、增强for循环、lambda表达式都适用，for循环例外)
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.print(s);
        }
    }
}
