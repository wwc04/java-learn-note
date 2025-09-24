package Thread.ThreadSynchronization;

//取款线程类，用于模拟多线程环境下对账户进行取款操作
public class DrawThread extends Thread {
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    //线程执行方法，调用账户的取款方法进行取款操作
    @Override
    public void run() {
        acc.drawMoney(100000); // 取款100000
    }
}
