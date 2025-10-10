package NetCommunication.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

// UDP通信 客户端（后启动）
public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(); // 创建UDP通信 客户端socket

        Scanner sc = new Scanner(System.in);

        // 多次发送数据
        while (true) {
            System.out.println("输入：");
            String msg = sc.nextLine(); //键盘录入准备要发送的数据
            if ("exit".equals(msg)) { // 判断输入的字符串，如果输入的是exit，则退出程序
                System.out.println("退出成功");
                break;
            }
            byte[] bytes = msg.getBytes(); // 把字符串转换成字节数组
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                    InetAddress.getLocalHost(), 6666);// 创建数据包，指定发送的数据、长度、目标IP和端口

            socket.send(packet); // 发送数据包
        }
    }
}
