package IO.Output.DataOutputStreamTest;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

//数据输出流（数据流）
public class DataOutputStreamTest {
    public static void main(String[] args) {
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/java/IO/Output/DataOutputStreamTest/DataOutputStreamTest.txt"));
        ) {
            dos.writeInt(119);
            dos.writeBoolean(true);
            dos.writeUTF("万文成"); //输出数据和数据类型（不是乱码）
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
