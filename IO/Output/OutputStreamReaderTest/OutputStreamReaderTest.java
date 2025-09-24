package IO.Output.OutputStreamReaderTest;

import java.io.*;

//字符输出转换流（控制写出去的字符为什么字符集编码）
public class OutputStreamReaderTest {
    public static void main(String[] args) {
        try (
                OutputStream os = new FileOutputStream("src\\main\\java\\IO\\Input\\OutputStreamReaderTest\\OutputStreamReader.txt");
                Writer osw = new OutputStreamWriter(os, "GBK"); //控制写出去的字符为GBK字符集编码
                BufferedWriter bw = new BufferedWriter(osw); //创建一个文件字符缓冲输入流包装原始的字符输入流
        ) {
            bw.write("万文成");
            bw.newLine();
            bw.write("java");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
