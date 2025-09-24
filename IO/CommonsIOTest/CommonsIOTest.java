package IO.CommonsIOTest;

import org.apache.commons.io.FileUtils;
import java.io.File;

//使用IO框架进行IO相关的一些操作
public class CommonsIOTest {
    public static void main(String[] args) throws Exception {
        //1.复制文件到目标文件
        FileUtils.copyFile(new File("src/main/java/IO/Test/CopyTest2(2).txt"),new File("src/main/java/IO/CommonsIOTest/CommonsIOTest.txt"));
        //2。复制文件夹到目标文件夹
        FileUtils.copyDirectory(new File("D:/操作系统"),new File("D:/学习课程/操作系统"));
        //3.删除文件夹
        FileUtils.deleteDirectory(new File("D:/操作系统"));
    }
}
