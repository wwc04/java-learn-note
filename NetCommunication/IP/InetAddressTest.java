package NetCommunication.IP;

import java.net.InetAddress;

// InetAddress类的使用
public class InetAddressTest {
    public static void main(String[] args) throws Exception {

        InetAddress ip = InetAddress.getLocalHost(); // 获取本机IP地址对象
        System.out.println(ip.getHostName()); // 获取本机主机名
        System.out.println(ip.getHostAddress()); // 获取本机IP

        InetAddress ip2 = InetAddress.getByName("www.baidu.com"); // 获取指定主机的IP地址对象
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        System.out.println(ip2.isReachable(5000)); // 判断指定主机是否可以连通，连通返回true，否则返回false
    }
}
