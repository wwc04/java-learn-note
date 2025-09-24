package IO.Input.ObjectInputStreamTest;

import IO.Output.ObjectOutputStreamTest.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//对象字节输入流（序列化流）
public class ObjectInputStreamTest {
    public static void main(String[] args) {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/IO/Output/ObjectOutputStreamTest/ObjectOutputStreamTest.txt"))
        ){

                User u = (User) ois.readObject();
                System.out.println(u);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
