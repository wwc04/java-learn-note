package Thread.ThreadCommunication;

//线程通信
public class ThreadCommunication {
    public static void main(String[] args) {
        //需求：3个生产者线程负责生产包子 ，每个线程每次生产1个包子放在桌子上；2个消费者线程负责吃包子，每个线程每次从桌子上拿1个包子，
        Desk desk = new Desk();

        new Thread(() ->{
            while (true) {
                desk.put();
            }
        }, "厨师1").start();

        new Thread(() ->{
            while (true) {
                desk.put();
            }
        }, "厨师2").start();

        new Thread(() ->{
            while (true) {
                desk.put();
            }
        }, "厨师3").start();

        new Thread(() ->{
            while (true) {
                desk.get();
            }
        }, "吃货1").start();

        new Thread(() ->{
            while (true) {
                desk.get();
            }
        }, "吃货2").start();

    }
}
