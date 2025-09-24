package IO.Output.OutputStreamTest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

//文件字节输出流(包含缓冲输出流)
public class OutputStreamTest {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("src\\main\\java\\IO\\Input\\OutputStreamTest\\OutputStream.txt");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        //绝对路径后加true可以追加数据不被覆盖
        os.write(119); //写一个字节出去
        os.write('w');
        os.write(99);

        byte[] bytes = "万文成".getBytes(); //写一个字节数组出去
        bos.write(bytes);

        bos.write("\r\n".getBytes()); //换行符

        bos.write(bytes, 0, 3); //写出部分字节数组

        bos.close();
    }
}
