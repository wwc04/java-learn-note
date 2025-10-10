package NetCommunication.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

// 服务端（先启动）
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");

        DatagramSocket socket = new DatagramSocket(6666);// 创建UDP套接字并绑定到端口6666

        byte[] buffer = new byte[1024 * 64]; // 创建一个缓冲区，用于存储接收到的数据
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length); // 创建数据包，用于接收数据

        while (true) {
            socket.receive(packet); // 接收客户端发送的数据包
            String rs = new String(packet.getData(), 0, packet.getLength()); // 获取数据包中的数据
            System.out.println("接收的信息：" + rs); // 将接收到的字节数据转换为字符串

            System.out.println(packet.getAddress().getHostAddress()); // 获取客户端的IP
            System.out.println(packet.getPort()); // 获取客户端的端口
        }
    }
}
