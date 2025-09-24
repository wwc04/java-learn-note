package IO.Input.InputStreamTest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//文件字节输入流
public class InputStreamTest {
    public static void main(String[] args) throws Exception { //可能找不到而爆出的异常（直接抛出）
        //创建文件字节输入流管道，与源文件相同
        InputStream is = new FileInputStream(new File("src\\main\\java\\IO\\Input\\InputStreamTest\\InputStream.txt"));
        BufferedInputStream bis = new BufferedInputStream(is); //创建一个文件字符缓冲输入流包装原始的字符输入流
        /*
        //简化
        //FileInputStream is = new FileInputStream(("test\\src\\InputStreamTest.txt"));
        //只能读取一个字节
        int a1 = is.read();
        System.out.println((char) a1);
        */

        /*
        int a;
        while ((a = is.read()) != -1) { //文件为空返回-1
            System.out.print((char) a); //读取全部字节，每次读取一个
        } //这种方法读取性能差
        */

        byte[] buffer = new byte[3]; //读取三个
        int len; //记住读取了几个字节
        while ((len = bis.read(buffer)) != -1) {
            String rs = new String(buffer, 0, len);
            System.out.print(rs); //读取全部字节，每次读取三个字节（可能乱码）
        } //这种方法读取性能比上述方法强

        /*
        //读取全部字节但只支持jdk8以上
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));
        */


        is.close(); //使用完必须关闭，释放系统资源
    }
}
