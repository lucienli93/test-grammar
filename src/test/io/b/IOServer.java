package test.io.b;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class IOServer {

    public static void main(String[] args) {
        // ����˴���ͻ�����������
        try {
            ServerSocket serverSocket = new ServerSocket(3333);
         // ���յ��ͻ�����������֮��Ϊÿ���ͻ��˴���һ���µ��߳̽�����·����
            new Thread(() -> {
                while (true) {
                    try {
                        // ����������ȡ�µ�����
                        Socket socket = serverSocket.accept();

                        // ÿһ���µ����Ӷ�����һ���̣߳������ȡ����
                        new Thread(() -> {
                            try {
                                int len = 0;
                                byte [] data = new byte[1024];
                                InputStream inputStream = socket.getInputStream();
                                while ((len = inputStream.read(data)) != -1) {
                                    System.out.println(new String(data, 0, len));
                                }
                            } catch (IOException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }).start();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
