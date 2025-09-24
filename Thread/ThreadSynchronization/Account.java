package Thread.ThreadSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//银行账户类，用于模拟多线程环境下的取钱操作
public class Account {
    private String cardId;  // 卡号
    private double money;   // 账户余额
    private final Lock lk = new ReentrantLock(); //线程同步方法三：Lock锁 1.创建一个Lock锁
    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    //线程同步方法二：同步方法
    /*public synchronized void drawMoney(double money) {*/
    public void drawMoney(double money) {

        String name = Thread.currentThread().getName();
        // 线程同步方法一：同步代码块
        // 使用synchronized关键字锁定当前对象(this)，确保同一时间只有一个线程可以执行以下代码块，避免多线程并发问题
        /*synchronized (this) {*/
        try {
            lk.lock(); // 2.锁定当前对象
            if (this.money >= money) {
                System.out.println(name + "取钱成功，取钱金额：" + money);
                this.money -= money;
                System.out.println("余额：" + this.money);
            } else {
                System.out.println(name + "取钱失败，余额不足！");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock(); // 3.解锁当前对象
        }
        /*}*/
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
