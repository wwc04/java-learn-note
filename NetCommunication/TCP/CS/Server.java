package NetCommunication.TCP.CS;

import java.net.ServerSocket;
import java.net.Socket;

// TCP通信 服务端
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        ServerSocket serverSocket = new ServerSocket(8888); // 创建服务端，同时绑定端口号

        while (true) {
            Socket socket = serverSocket.accept();  // 等待客户端连接
            System.out.println(socket.getRemoteSocketAddress() + "已连接"); // 获取连接客户端的IP
            new ServerReaderThread(socket).start(); // 启动一个线程
        }
    }
}
