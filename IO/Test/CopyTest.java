package IO.Test;

import java.io.*;

//文件复制 (字节流适合文件复制，不是适合文件读写)
public class CopyTest {
    public static void main(String[] args) throws Exception {
        //try-with-resource 括号里放置资源对象，用完之后会自动调动close方法释放资源
        try (
                InputStream is = new FileInputStream("C:/Users/成/Pictures/yami.png"); //创建文件字节输入流并与源文件接通
                InputStream bis = new BufferedInputStream(is, 8192 * 2); //创建一个文件字节缓冲输入流包装原始的字节输入流 （自带8kb的缓冲池，可以自定义缓冲池大小）
                OutputStream os = new FileOutputStream("C:/Users/成/Pictures/动漫截图/yami.png");//创建文件字节输出流并与目标文件接通
                OutputStream bos = new BufferedOutputStream(os); //创建一个文件字节缓冲输出流包装原始的字节输出流
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len); //使用带缓冲池的读取和输出数据
            }
            System.out.println("复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
