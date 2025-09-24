package IO.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//复制文件 恢复顺序
public class CopyTest2 {
    public static void main(String[] args) {
        try ( //抛出异常
              //2.创建文件字节缓冲输入流与源文件接通
              BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\成\\IdeaProjects\\test\\src\\main\\java\\IO\\CopyTest2(1).txt"));
              BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\成\\IdeaProjects\\test\\src\\main\\java\\IO\\CopyTest2(2).txt"));
        ) {
            //1.定义一个ArrayList集合存储每段数据
            List<String> date = new ArrayList<>();

            //3.读取每行，存储到集合中去
            String line;
            while ((line = br.readLine()) != null) {
                date.add(line);
            }

            //4.对集合中的每段进行排序(大于10行可用split方法切割获取第一个数据，然后再进行排序)
            Collections.sort(date);
            System.out.println(date);

            //5.遍历集合，写入到新文件中
            for (String ln : date) {
                bw.write(ln);
                bw.newLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
