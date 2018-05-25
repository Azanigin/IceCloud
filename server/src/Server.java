import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {
    private ServerSocket serverSocket;

    private Vector clients;


    public Server(){

        try {
            serverSocket = new ServerSocket(8190);
            clients = new Vector();
            System.out.println("Сервер запущен");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Клиент подключился");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
