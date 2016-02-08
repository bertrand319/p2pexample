package bertrand.example.p2p;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Sender {

	public static void main(String[] args) {
		try {
			byte[] buf = new byte[]{'h','i'};
			InetAddress address = InetAddress.getByName("230.0.0.1");
			int port = 7890;
			DatagramPacket packet = new DatagramPacket(buf, buf.length, address, port);
			MulticastSocket socket = new MulticastSocket();
			socket.send(packet);
			System.out.println("Send a message!");
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
