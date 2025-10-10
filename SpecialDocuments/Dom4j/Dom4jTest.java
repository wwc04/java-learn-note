package SpecialDocuments.Dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

//掌握Dom4j框架解析Xml文件
public class Dom4jTest {
    public static void main(String[] args) throws Exception {
        //创建一个Dom4j框架提供的解析器
        SAXReader saxReader = new SAXReader();

        //使用saxReader对象把需要解析的Xml文件读取成文档对象
        Document document = saxReader.read("src/xml/hello.xml");

        //从文档对象中解析Xml文件的数据
        Element root = document.getRootElement();
        System.out.println(root.getName()); //获取元素名字

        //获取当前元素下的全部一级子元素
        /*List<Element> elements = root.elements();*/
        List<Element> elements = root.elements("user"); //可指定拿一级子元素
        for(Element element : elements){
            System.out.println(element.getName());
        }

        //获取当前元素下的某个子元素
        Element people = root.element("people");
        System.out.println(people.getText()); //获取文本内容

        //多个user子元素默认获取第一个user子元素
        Element user = root.element("user");
        System.out.println(user.elementText("name"));

        //获取元素的某个属性信息
        System.out.println(user.attributeValue("id")); //方法1

        Attribute id = user.attribute("id"); //方法2
        System.out.println(id.getName());
        System.out.println(id.getValue());

        //获取文本内容
        System.out.println(user.elementText("age"));

    }
}
