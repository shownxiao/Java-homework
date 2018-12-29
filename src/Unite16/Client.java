package Unite16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/* 基础训练1客户端 */
import java.net.*;
import java.io.*;


public class Client {
    public static void main(String args[]) {
        try {
            Socket socket = new Socket("localhost",5432);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("用户名:admin;密码:123");
            pw.flush();
            socket.shutdownOutput();

            //获取输入流
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info = null;

            while((info=br.readLine())!=null) {
                System.out.println("我是客户端,服务器说:"+info);
            }

            br.close();
            is.close();
            pw.close();
            os.close();
            socket.close();
        }catch(IOException e) {}
    }
}

