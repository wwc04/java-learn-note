package JiHe.Collection;

import java.util.Arrays;

//可变参数
public class Collection3 {
    public static void main(String[] args) {
        test(); //不传输数据
        test(10); //传输一个数据
        test(10, 20, 30); //传输多个数据
        test(new int[]{10, 20, 30, 40}); //传输一个数组
    }

    public static void test(int... num) { //在一个形参列表中只有一个可变参数
        //可变参数在方法内部，本质就是一个数组
        System.out.println(num.length);
        System.out.println(Arrays.toString(num));
    }
}
