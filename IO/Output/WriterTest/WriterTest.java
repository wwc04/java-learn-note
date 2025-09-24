package IO.Output.WriterTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//文件字符输出流(包含缓冲输出流)
public class WriterTest {
    public static void main(String[] args) {
        try (
                Writer fw = new FileWriter("src\\main\\java\\IO\\Input\\WriterTest\\Writer.txt");
                BufferedWriter bw = new BufferedWriter(fw); //创建一个文件字符缓冲输入流包装原始的字符输入流
        ) {
            bw.write('w'); //写入一个字符

            /*fw.write("\r\n"); //换行符*/
            bw.newLine(); //换行符

            bw.write("万文成"); //写入一个字符串

            bw.write("学java",0,1); //写入部分字符串

            char[] buffer = {'j','a','v','a'}; //写入一个字符数组
            bw.write(buffer);

            /*fw.write("\r\n");*/
            bw.newLine();

            bw.write(buffer,0,4); //写入部分字符数组
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
