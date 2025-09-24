package IO.Input.DataInputStreamTest;

import java.io.DataInputStream;
import java.io.FileInputStream;

// 数据输入流
public class DataInputStreamTest {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("src/main/java/IO/Output/DataOutputStreamTest/DataOutputStreamTest.txt"));
        ) {
            int a = dis.readInt(); //数据类型顺序与输出流一一对应
            System.out.println(a);

            Boolean b = dis.readBoolean();
            System.out.println(b);

            String c = dis.readUTF();
            System.out.println(c);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
