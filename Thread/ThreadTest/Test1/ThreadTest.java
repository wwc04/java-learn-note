package Thread.ThreadTest.Test1;

//多线程创建方式一：继承Thread类
public class ThreadTest {
    public static void main(String[] args) throws Exception {

        //3.创建ExtendThreadTest线程类的对象代表一个线程
        Thread t = new MyThreadTest("1号子线程");
        t.start(); // 必须使用start方法

        Thread t2 = new MyThreadTest("2号子线程");
        t2.start();

        //Thread的常用方法
        //（一）获取线程名字 （第一个默认为Thread-0）
        /*System.out.println(t.getName());
        System.out.println(t2.getName());*/

        Thread m = Thread.currentThread();
        //(二)主动设置线程名字
        m.setName("主线程");

        for (int i = 1; i <= 10; i++) { // 主程序任务放在启动子程序之后
            System.out.println(m.getName() + "输出：" + i);
            if(i==3){
                Thread.sleep(5000); //(三)sleep方法，暂停执行，执行完其他后再执行（5秒）
            }
        }
        
        // 等待所有子线程执行完毕
        System.out.println("所有线程执行完毕");
    }
}
