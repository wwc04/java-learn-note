package NetCommunication.TCP.CS;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

// TCP通信 客户端
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8888); // 创建Socket对象, 指定服务器的IP和端口号
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        // 从Socket通信管道中得到一个字节输出流，用这个字节流来发送数据 把低级的字节输出流包装成数据输出流

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据：");
            String msg = sc.nextLine();

            if ("exit".equals(msg)) {
                System.out.println("退出");
                dos.close();
                socket.close();
                break;
            }

            dos.writeUTF(msg); // 发送数据
            dos.flush();  // 刷新把数据发出去, 不刷新数据可能不发送出去，或者数据可能只发送一部分
        }
    }
}
