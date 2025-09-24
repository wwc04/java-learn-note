package Thread.ThreadPool.Callable;

import java.util.concurrent.Callable;
public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int  n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception { //描述线程的任务，返回线程执行后的结果（求1~n的和）
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "求出了1-" + n + "的和为：" + sum;
    }
}
