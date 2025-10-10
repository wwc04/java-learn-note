package NetCommunication.TCP.BS;

import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable { //实现Runnable接口
    private Socket socket;

    public ServerReaderRunnable(Socket socket) { //构造方法，初始化Socket连接
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            PrintStream ps = new PrintStream(socket.getOutputStream()); // 从Socket通信管道中获取字节输出流，将字节输出流包装成字节打印流
            ps.println("HTTP/1.1 200 OK"); // 响应状态行,告诉浏览器，响应的状态是OK
            ps.println("Content-Type:text/html;charset=UTF-8"); // 响应头,告诉浏览器，响应体的内容是HTML格式
            ps.println(); // (必须)空行，作为响应头和响应体的分隔符
            ps.println("hello");
            ps.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
