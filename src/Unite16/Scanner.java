package Unite16;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

/* 编程练习1 */
public class Scanner {
    public static void main(String args[] ) throws IOException {
        String host = args[0];
        int begin = Integer.parseInt(args[1]);
        int end = Integer.parseInt(args[2]);
        Socket s = null;
        for (int port = begin; port <= end; port++) {
            try {
                s = new Socket(host, port);
                System.out.println("可连接的端口:" + port);
            }catch (ConnectException e){}
            if (s != null)s.close();
        }
    }
}
