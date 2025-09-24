package Thread.ThreadPool.Runnable;

import java.util.concurrent.*;

//线程池
public class ThreadPoolTest1 {
    public static void main(String[] args) {
        // 创建一个线程池，核心线程数为3，最大线程数为5，空闲线程存活时间为8秒
        // 使用容量为4的有界数组阻塞队列，使用默认的线程工厂，指定拒绝策略AbortPolicy
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS, //设置存活时间单位SECONSDS（秒）
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Runnable target = new MyRunnable();
        //提交Runnablesna个任务,线程池会自动创建线程并执行任务
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //等待线程池处理完成其中一个才会提交任务
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //超出容量的线程，线程池会创建临时线程处理
        pool.execute(target);
        pool.execute(target);
        //再超出容量的线程，根据调用的方法线程池会做出不同的处理方式
        pool.execute(target);


        /*pool.shutdown(); //线程池关闭,线程池不再接受新的任务，但会执行已经提交的任务*/
        /*pool.shutdownNow(); //线程池立即关闭，线程池不再接受新的任务，并打断正在执行的任务*/
    }
}
