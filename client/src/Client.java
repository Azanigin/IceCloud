import java.io.IOException;
import java.net.Socket;

public class Client {
    Socket socket;

    {
        try {
            socket = new Socket("127.0.0.1",8190);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
