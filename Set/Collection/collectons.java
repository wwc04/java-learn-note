package JiHe.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//操作集合的工具类 Collections
public class collectons {
    public static void main(String[] args) {
        //1.为集合批量添加数据
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "马加七", "牛尿闻");
        System.out.println(names);

        //2.打乱List集合的元素顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.对List集合中的元素进行升序排序
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(6);
        list.add(4);
        Collections.sort(list);
        System.out.println(list);

        //4.
    }
}
