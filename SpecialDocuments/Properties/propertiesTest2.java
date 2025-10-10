package SpecialDocuments.Properties;

import java.io.FileWriter;
import java.util.Properties;

//把键值对信息存储带属性文件中(路径后加上注释)
public class propertiesTest2 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("country", "China");
        properties.store(new FileWriter("src/main/java/SpecialDocuments.Properties/user2.properties"),
                "QwQ");
    }
}
