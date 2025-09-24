package JiHe.Map;

import java.util.*;

//Map双列集合的常用方法
public class Map1 {
    public static void main(String[] args) {
        //Map<String ,Integer> map = new HashMap<>(); //无序，不重复，无索引
        //Map<String, Integer> map = new TreeMap<>(); //可排序，不重复，无索引
        Map<String, Integer> map = new LinkedHashMap<>(); //有序，不重复，无索引
        map.put("小米15", 4399);
        map.put("小米15pro", 4999);
        map.put("vivoPromini", 4499);
        map.put("天选5", 8499);
        System.out.println(map);

        //2.获取集合的大小
        System.out.println(map.size());

        /*//3.清空集合
        map.clear();
        System.out.println(map);*/

        //4.判断集合是否为空
        System.out.println(map.isEmpty());

        //5.根据键获取对应值
        int v1 = map.get("小米15");
        System.out.println(v1);
        System.out.println(map.get("天选5"));

        //6.根据键删除整个元素
        map.remove("小米15");
        System.out.println(map);

        //7.判断是否包含某个键
        System.out.println(map.containsKey("天选5"));

        //8.判断是否包含某个值
        System.out.println(map.containsValue(4499));

        //9.获取Map集合的全部键
        Set<String> keys = map.keySet();
        System.out.println(keys);

        //10.获取Map集合的全部值
        Collection<Integer> values = map.values();
        System.out.println(values);

        //拓展（将其他Map集合的数据加入到一个Map集合中）
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("小米15", 4399);
        map2.put("vivoPromini", 4499);
        map2.put("天选5", 8499);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("小米15pro", 4599);
        map3.put("vivoPromini", 4499);
        map3.put("天选5Pro", 8799);

        map2.putAll(map3);
        System.out.println(map2);
        System.out.println(map3);
    }
}
