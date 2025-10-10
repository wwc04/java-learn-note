package NetCommunication.TCP.CS;

import java.io.DataInputStream;
import java.net.Socket;

//服务器端读取线程类，用于处理来自多个客户端的数据读取操作
public class ServerReaderThread extends Thread {
    private Socket socket;

    //构造方法，初始化Socket连接
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 从Socket通信管道中获取字节输入流，将字节输入流包装为数据输入流，便于读取UTF格式数据
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            while (true) { // 循环接收客户端数据
                try {
                    String rs = dis.readUTF(); // 读取客户端发送的UTF格式数据
                    System.out.println("接收到" + socket.getRemoteSocketAddress() + "发出的信息：" + rs); // 输出接收到的数据和客户端地址信息
                } catch (Exception e) { // 捕获异常，通常是客户端断开连接导致的
                    System.out.println(socket.getRemoteSocketAddress() + "离线"); // 输出离线客户端地址
                    dis.close(); //关闭离线客户端数据输入流
                    socket.close(); // 关闭离线客户端Socket连接，释放资源
                    break; // 跳出循环，结束线程
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
