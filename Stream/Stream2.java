package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

//Stream流的中间方法
//注意1：中间方法返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
//注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
public class Stream2 {
    public static void main(String[] args) {
        //1.过滤(filter)、获取前几个元素(limit)、跳过前几个元素(skip)
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张良", "谢广坤");
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("--------------------------------------------------");

        list.stream().limit(3).forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("--------------------------------------------------");

        list.stream().skip(3).forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------");

        //2.元素去重(distinct)、合并a流和b流为一个流(concat)(数据类型保持一致)
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张无忌", "周芷若", "周芷若", "赵敏", "张强", "张三丰", "赵敏", "张三丰", "张良", "谢广坤");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "李四", "王五");

        list2.stream().distinct().forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("--------------------------------------------------");

        Stream.concat(list2.stream(), list3.stream()).forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------");

        //3.转换流中的数据类型(map)
        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list4, "张无忌-15", "周芷若-14", "赵敏-16", "张强-15");
        list4.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.print(s + " "));
        /*list4.stream().map(new Function<String, Integer>() { //第一个数据类型为流中原来的数据类型，第二个数据类型为转化后的数据类型
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");//切割 (例："张无忌-15" ，arr[0]为"张无忌"，arr[1]为"15")
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);//类型转换
                return age;
            }
        }).forEach(s -> System.out.print(s + " "));*/
    }
}
