package Unite16;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* 基础训练2 */
public class IP {
    public static void main(String args[]){
        try {
            String myaddr = InetAddress.getLocalHost().getHostAddress();
            System.out.println("本机的IP地址:"+myaddr);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
