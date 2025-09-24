package JiHe.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

//Set集合的方法（Collection提供，几乎没有特殊方法）
public class Collection_Set {
    public static void main(String[] args) {
        /*Set<Integer> set = new HashSet<>(); //无序(存入位置根据哈希值)、不重复、无索引*/
        /*Set<Integer> set = new LinkedHashSet<>(); //有序（多了一个双链表的机制记录前后元素的位置）、不重复、无索引*/
        //可自定义排序(基于红黑树实现排序)、不重复、无索引
        Set<User> user = new TreeSet<>((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())); //默认使用自带比较器（此比较器按身高升序）
        user.add(new User("w", 20, 168.0));
        user.add(new User("w", 21, 167.0));
        user.add(new User("w", 21, 168.0));
        user.add(new User("c", 22, 170.0));
        System.out.println(user);
    }
}
