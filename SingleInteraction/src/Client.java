import java.io.*;
import java.net.*;
import javax.swing.*;


public class Client {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 5001;
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket(SERVER_IP, SERVER_PORT);
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String sunucuCevap = input.readLine();
		JOptionPane.showMessageDialog(null, sunucuCevap);
		socket.close();
		System.exit(0);
	}

}
