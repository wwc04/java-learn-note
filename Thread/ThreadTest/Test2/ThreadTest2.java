package Thread.ThreadTest.Test2;

import java.lang.Runnable;

//多线程创建方式二：实现Runnable接口
public class ThreadTest2 {
    public static void main(String[] args) {
        /*//3.创建任务对象
        Runnable target = new MyRunnable();

        //4.把任务对象交给一个线程对象处理
        new Thread(target).start();

        for (int i = 1; i <= 50; i++) {
            System.out.println("主线程输出：" + i);
        }*/

        //第二种创建方法的第二种形式（直接创建Runnable接口的匿名内部类形式(lambda简化)）
        new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("子线程输出：" + i);
                }
        }).start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}
