package SpecialDocuments.Properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

//使用Properties类读取属性文件中的键值对信息
public class propertiesTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties(); //创建一个Properties的对象（键值对集合，空容器）
        properties.load(new FileReader("src/main/java/SpecialDocuments.Properties/user.properties")); //加载属性文件数据到Properties对象中去
        System.out.println(properties);

        properties.getProperty("admin"); //根据键取值

        Set<String> keys = properties.stringPropertyNames(); //遍历所有键值对
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "---->" + value);
        }

    }
}
