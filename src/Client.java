import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.setReuseAddress(true);

        String msg = "Hello jahid";
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(StandardCharsets.UTF_8), 0, msg.length(), InetAddress.getByName("103.84.253.122"), 9806);
        datagramSocket.send(datagramPacket);
    }
}
