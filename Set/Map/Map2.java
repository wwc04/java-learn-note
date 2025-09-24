package JiHe.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

//Map双列集合的遍历方法
public class Map2 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("m", 166.0);
        map.put("n", 176.0);
        map.put("d", 164.0);

        //1.获取Map集合的全部键，根据键获取对应的值(键找值)
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            double value = map.get(key);
            System.out.println(key + "-->" + value);
        }

        System.out.println("-------------------------------------");
        System.out.println();

        //2.调用Map集合提供entrySet方法，把Map集合转换成键值对类型的Set集合（键值对）
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + "-->" + value);
        }

        System.out.println("-------------------------------------");
        System.out.println();

        //3.
        map.forEach((k, v) -> {
            System.out.println(k + "-->" + v);
        });

        /*//上述方法的匿名内部类
        map.forEach(new BiConsumer<String, Double>() {
            @Override
            public void accept(String k, Double v) {
                System.out.println(k + "-->" + v);
            }
        });*/
    }
}
