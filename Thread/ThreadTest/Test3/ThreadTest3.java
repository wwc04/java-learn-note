package Thread.ThreadTest.Test3;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//多线程创建方式三：实现Callable接口
public class ThreadTest3 {
    public static void main(String[] args) throws Exception {
        //3.创建一个Callable的对象
        Callable<String> call = new MyCallable(100); //给n赋值

        //4.把Callable的对象封装成一个FuyrueTask对象
        FutureTask<String> f1 = new FutureTask<>(call);

        //5.把任务对象交给一个Thread
        new Thread(f1).start();

        String rs = f1.get();
        System.out.println(rs);
    }
}
