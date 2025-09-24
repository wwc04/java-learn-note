package IO.Input.ReaderTset;

import java.io.BufferedReader;
import java.io.FileReader;

//文件字符输入流（包含缓冲输入流）
public class ReaderTest {
    public static void main(String[] args) {
        try (
                /*
                Reader rf = new FileReader("C:\\Users\\成\\IdeaProjects\\test\\src\\main\\java\\IO\\ReaderTset\\Reader.txt");
                BufferedReader br = new BufferedReader(rf); //创建一个文件字符缓冲输入流包装原始的字符输入流
                */
                //简写
                BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\IO\\Input\\ReaderTset\\Reader.txt"));
        ) {
            /*
            char[] buffer = new char[3]; //每次读取三个字符(print加ln可了解)
            int len;
            while ((len = br.read(buffer)) != -1) { // //使用带缓冲池的读取数据
                System.out.print(new String(buffer, 0, len));
            }
            */
            String line; //每次读取一行数据
            while ((line = br.readLine()) != null) { //使用带缓冲池的读取数据
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
