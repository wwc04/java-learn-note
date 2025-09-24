package Thread.ThreadPool.Callable;

import java.util.concurrent.*;

//线程池
public class ThreadPoolTest2 {
    public static void main(String[] args) throws Exception {
        // 创建一个线程池，核心线程数为3，最大线程数为5，空闲线程存活时间为8秒
        // 使用容量为4的有界数组阻塞队列，使用默认的线程工厂，指定拒绝策略为CallerRunsPolicy
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS, //设置存活时间单位SECONSDS（秒）
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        // 通过Executors创建一个线程池对象
        ExecutorService pool2 = Executors.newFixedThreadPool(3);
        // 计算密集型任务: 核心线程数量 = CPU的核数 + 1   I/O密集型任务: 核心线程数量 = CPU的核数 * 2
        // 注意：大型并发系统环境中使用Executors如果不注意可能出现系统风险（开发推荐ThreadPoolExecutor创建线程池对象）

        // 提交四个Callable任务到线程池，分别计算1~10, 1~20, 1~30, 1~40的和
        Future<String> f1 = pool.submit(new MyCallable(10)); // 计算1~10的和
        Future<String> f2 = pool.submit(new MyCallable(20)); // 计算1~20的和
        Future<String> f3 = pool.submit(new MyCallable(30)); // 计算1~30的和
        Future<String> f4 = pool.submit(new MyCallable(40)); // 计算1~40的和

        // 获取并打印每个任务的执行结果
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

        pool.shutdown(); //线程池关闭,线程池不再接受新的任务，但会执行已经提交的任务
        /*pool.shutdownNow(); //线程池立即关闭，线程池不再接受新的任务，并打断正在执行的任务*/
    }
}
