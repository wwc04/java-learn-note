package Thread.ThreadTest.Test2;

import java.lang.Runnable;

//1.定义一个任务类，实现Runnable接口
public class MyRunnable implements Runnable {
    //2.重写runnable的run方法
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}

