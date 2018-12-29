package Unite16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/* 基础训练1服务器端 */
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5432);

        while(true) {
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String info = null;

            while((info = br.readLine())!=null) {
                System.out.println("我是服务器,客户端说:"+info);
            }

            socket.shutdownInput();
            OutputStream os =socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("欢迎你！");
            pw.flush();
            pw.close();
            os.close();
            br.close();
            isr.close();
            is.close();
            socket.close();
            serverSocket.close();
        }
    }
}
