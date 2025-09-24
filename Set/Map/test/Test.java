package JiHe.Map.test;

import java.util.*;

//集合的嵌套
public class Test {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1, "抚州市","南昌市","赣州市");
        map.put("江西省", cities1);

        List<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, "武汉市","宜昌市","鄂州市");
        map.put("湖北省", cities2);

        List<String> cities3 = new ArrayList<>();
        Collections.addAll(cities3, "唐山市","保定市","张家口市");
        map.put("河北省", cities3);

        System.out.println(map);

        List<String> cities = map.get("江西省");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
