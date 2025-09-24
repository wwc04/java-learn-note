package Thread.ThreadTest.Test3;

import java.util.concurrent.Callable;

//1.实现Callable接口
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) { //创建一个有参构造器接收n
        this.n = n; //将n赋值给n
    }

    //2.重写Call方法
    @Override
    public String call() throws Exception { //描述线程的任务，返回线程执行后的结果（求1~n的和）
        //
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "线程求出了1-" + n + "的和是" + sum;
    }
}
