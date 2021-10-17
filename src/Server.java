import java.io.IOException;
import java.net.*;
import java.nio.charset.Charset;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket=new DatagramSocket(9806);

        byte[] bytes=new byte[512];
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(datagramPacket);

        System.out.println(new String(datagramPacket.getData()));
    }
}