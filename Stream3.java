package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

//Stream流的终结方法（遍历、统计、收集流中的数据，放到数组中、收集流中的数据，放到集合中)
public class Stream3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张良", "谢广坤");

        //统计(数据个数)(count)
        long count = list.stream().count();
        System.out.println(count);

        System.out.println();
        System.out.println("--------------------------------------------------");

        //收集流中的数据，放到数组中(toArray)
        String[] arr = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr));
        /*String[] arr = list.stream().toArray(new IntFunction<String[]>(){ //IntFunction的泛型：具体的数据类型
            @Override
            public String[] apply(int value) { //apply的形参：数组长度跟流中的数据个数保持一致
                return new String[value]; //apply的返回值：具体类型的数组
            }
        });
        System.out.println(Arrays.toString(arr)); //将数组转化为字符串*/

        System.out.println();
        System.out.println("--------------------------------------------------");

        //收集流中的数据，放到集合中(collect)
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张无忌-男-15", "周芷若-女--14", "赵敏-女-16", "张强-男-15");
        //收集到list集合中(需求：收集男性)
        List<String> newlist = list2.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        //调用Collectors工具类中的tolist方法创建ArrayList集合(需要收集到Set集合调用方法toSet即可)
        //区别：收集到Set集合会去除重复
        System.out.println(newlist);

        System.out.println();
        System.out.println("--------------------------------------------------");

        //收集到Map集合(键：姓名、值：年龄)
        Map<String, String> map = list2.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> s.split("-")[2]));
        /*匿名内部类
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));*/
        System.out.println(map);

}
}
