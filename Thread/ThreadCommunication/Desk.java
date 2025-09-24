package Thread.ThreadCommunication;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    // 存储物品的列表，作为生产者和消费者之间的共享缓冲区
    private List<String> list = new ArrayList<>();

    public synchronized void put() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 0) {
                list.add(name + "做的包子");
                System.out.println(name + "做出了一个包子");
                Thread.sleep(2000);
                this.notify(); // 唤醒正在等待的线程
                this.wait(); // 使当前线程等待(放在后面)
            } else {
                //有包子，不做包子，唤醒别人，等待自己
                this.notify();
                this.wait();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 1) {
                System.out.println(name + "吃了1个" + list.get(0));
                list.remove(0); // 吃掉一个包子
                Thread.sleep(2000);
                this.notify();
                this.wait(); // 使当前线程等待(放在后面)
            } else {
                System.out.println(name + "没有吃东西");
                this.notify();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
