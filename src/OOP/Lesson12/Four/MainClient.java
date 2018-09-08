package OOP.Lesson12.Four;
/*
Created by matua on 24.08.2018 at 15:38
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class MainClient implements Runnable {
    private Socket socket;
    private String info;
    private Thread thread;

    public MainClient(Socket socket, String answ) {
        super();
        this.socket = socket;
        this.info = answ;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        try (InputStream is = socket.getInputStream(); OutputStream os = socket.getOutputStream();
             PrintWriter pw = new PrintWriter(os)) {
            byte[] rec1 = new byte[is.available()];
            is.read(rec1);
            String response = "HTTP/1.1 200 OK\r\n" + "Server: My_Server\r\n" + "Content-Type:text / html\r\n" + "Content-Length: " + "\r\n" + "Connection: close\r\n\r\n";
            pw.print(response + info);
            pw.flush();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
