package NetCommunication.TCP.BS;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// TCP通信 BS架构 服务端
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        ServerSocket serverSocket = new ServerSocket(8080); // 创建服务端，同时绑定端口号
        ThreadPoolExecutor pool = new ThreadPoolExecutor(16 * 2, 16 * 2, 0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()); // 创建线程池

        while (true) {
            Socket socket = serverSocket.accept();  // 等待客户端连接
            pool.execute(new ServerReaderRunnable(socket)); // 把客户端对应的Socket通信管道交给线程池处理
        }
    }
}
