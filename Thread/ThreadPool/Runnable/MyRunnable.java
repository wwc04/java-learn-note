package Thread.ThreadPool.Runnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程启动了");
        try {
            Thread.sleep(2000); //
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + "线程被中断了");
        }
    }
}
