package bertrand.example.p2p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Receiver {
	
	public static void main(String[] args) {
		int port = 7890;
		try {
			MulticastSocket socket = new MulticastSocket(port);
			InetAddress address = InetAddress.getByName("230.0.0.1");
			socket.joinGroup(address);
			while(true) {
				System.out.println("Waiting messages...");
				byte[] buf = new byte[100];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				System.out.println(new String(buf));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
