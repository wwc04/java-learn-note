package Thread.ThreadSynchronization;

//线程同步方法测试
public class ThreadSynchronization {
    public static void main(String[] args) {
        // 创建账户对象，余额为100000
        Account acc = new Account("NH", 100000);
        // 创建两个线程并启动，模拟小红和小明同时取钱
        new DrawThread(acc, "小红").start(); //小红
        new DrawThread(acc, "小明").start(); //小明
    }
}
