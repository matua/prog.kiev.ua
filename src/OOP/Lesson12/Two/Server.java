package OOP.Lesson12.Two;
/*
Created by matua on 21.08.2018 at 18:13
*/

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int counter = 0;
        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            while (true) {
                Socket socket = serverSocket.accept();
                counter++;
                Client client = new Client(socket, counter);
                client.run();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
