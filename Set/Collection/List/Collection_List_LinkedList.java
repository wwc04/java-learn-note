package JiHe.Collection.List;

import java.util.LinkedList;

//LinkedList集合()
public class Collection_List_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> q = new LinkedList<>(); //创建一个队列
        q.addLast("1");
        q.addLast("2");
        q.addLast("3");
        System.out.println(q);
        //出队
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());
        System.out.println("---------------------------------------------------------------");

        LinkedList<String> s = new LinkedList<>(); //创建一个栈对象(先进后出)
        //进栈(push)
        s.push("c");
        s.push("w");
        s.push("w");
        System.out.println(s);
        //出栈(pop)
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);
    }

}
