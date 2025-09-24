package Thread.ThreadTest.Test1;

//1.子类ExtendThread继承Thread线程类
public class MyThreadTest extends Thread {
    public MyThreadTest(String name) {
        super(name);
    } //添加有参构造器可简化主动设置线程名字

    //2.重写Thread类的run方法
    @Override
    public void run() {
        Thread t = Thread.currentThread(); //(四) 获取当前线程执行对象
        for (int i = 1; i <= 5; i++) {
            System.out.println(t.getName() + "输出：" + i);
        }
    }
}
