package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//获取Stream流
public class Stream1 {
    public static void main(String[] args) {
        //1.单列集合获取(Collections中的默认方法)
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a1", "b2", "c3", "d4", "e5");
        list.stream().forEach(s -> System.out.print(" " + s));//s表示流里的每一个数据

        System.out.println();
        System.out.println("--------------------------------------------------");

        //2.双列集合获取(不能直接获取)
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a", 1);
        hm.put("bb", 2);
        hm.put("ccc", 3);
        hm.put("dddd", 4);
        //第一种方法
        hm.keySet().stream().forEach(s -> System.out.print(" " + s));
        //第二种方法
        //hm.entrySet().stream().forEach(s-> System.out.println(s));

        System.out.println();
        System.out.println("--------------------------------------------------");

        //3.数组获取(Arrays工具类中的静态方法)
        int[] arr1 = {1, 2, 3, 4, 5};
        String[] arr2 = {"a", "b", "c"};
        Arrays.stream(arr1).forEach(s -> System.out.print(" " + s));
        System.out.println();
        Arrays.stream(arr2).forEach(s -> System.out.print(" " + s));

        System.out.println();
        System.out.println("--------------------------------------------------");

        //4.一堆零散的数据获取(调用Stream接口中的静态方法)
        java.util.stream.Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.print(" " + s));
        System.out.println();
        java.util.stream.Stream.of("a", "b", "c", "d").forEach(s -> System.out.print(" " + s));
    }
}
