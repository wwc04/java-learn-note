package IO.Output.ObjectOutputStreamTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//对象字节输出流（序列化流）
public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/IO/Output/ObjectOutputStreamTest/ObjectOutputStreamTest.txt"));
        ) {
            User u = new User("张三", 20, "男");
            oos.writeObject(u);
            System.out.println(oos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
