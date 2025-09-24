package IO.Output.PrintStreamTest;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

//打印流
public class PrintStreamTest {
    public static void main(String[] args) {
        try (
                //字节打印输出流
                PrintStream ps = new PrintStream("src/main/java/IO/Output/PrintStreamTest/PrintStream.txt","UTF-8");//可指定字符集编码
                /*
                //高级流不能追加数据，可换成低级流
                PrintStream ps = new PrintStream(new FileOutputStream("src/main/java/IO/Output/PrintStreamTest/PrintStream.txt",true));
                */
                /*
                //字符打印输出流 (与字节打印流功能上是一样的)
                PrintWriter pw = new PrintWriter("src/main/java/IO/Output/PrintStreamTest/PrintStream.txt");
                */
        ) {
            ps.println("万文成"); //打印流的主要方法
            System.setOut(ps); //输出语句的重定向，打印到目标文件
            System.out.println("不以物喜，不以己悲");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
