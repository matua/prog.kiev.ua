package OOP.Lesson12.Two;
/*
Created by matua on 21.08.2018 at 18:15
*/

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {
    private Socket socket;
    private int counter;

    public Client(Socket socket, int counter) {
        this.socket = socket;
        this.counter = counter;
    }

    @Override
    public void run() {
        try (OutputStream os = socket.getOutputStream();
             PrintWriter pw = new PrintWriter(os)
        ) {
            pw.printf("Hello %s!\n", System.getProperties().getProperty("user.name"));
            pw.printf("This is request #%d\n", counter);
            pw.println(System.getProperties().getProperty("os.name"));
            pw.println(System.getProperties().getProperty("os.version"));
            pw.printf("Memory: %d GB\n", Runtime.getRuntime().totalMemory()/1024/1024);
            pw.printf("%d processors\n", Runtime.getRuntime().availableProcessors());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
