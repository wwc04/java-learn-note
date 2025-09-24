package IO.Input.InputStreamReaderTest;

import java.io.*;

//字节输入转换流（解决乱码问题）
public class InputStreamReaderTest {

    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("src/main/java/IO/Input/InputStreamReaderTest/InputStreamReader.txt");
                Reader isr = new InputStreamReader(is, "GBK"); //文件字符型编码类型为GBK，转换为当前字符编码类型
                BufferedReader br = new BufferedReader(isr); //创建一个文件字符缓冲输入流包装原始的字符输入流
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
