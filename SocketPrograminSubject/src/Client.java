import java.io.*;
import java.net.*;

public class Client {
//	-Soket bağlantısını kurma 
	private Socket socket = null;
	
//	veriyi alabilmek için DataInputStream kullandık.
	private DataInputStream input = null;
	private DataOutputStream output = null;
	
//	-IP Adresi - TCP bağlantı noktasını sağlamak
	public Client(String address, int port) throws UnknownHostException, IOException {
//		Bağlantı kurmak.
		socket = new Socket(address, port);
		System.out.println("İstemci Sunucuya Bağlandı...");
		
//		system.in ile consoldan bilgi alıyoruz.
		input = new DataInputStream(System.in);
		output = new DataOutputStream(socket.getOutputStream());
		
//		-İstemci ile iletişim kurma
		String metin = "";
		while(!metin.equals("Bitti")) {
			try {
//		metini satır satır okumak için.
		metin = input.readLine();
//		veriyi utf karakter seti şeklinde yazdıracak.
		output.writeUTF(metin);
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
//		Bağlantıyı kapat
		input.close();
		output.close();
		socket.close();
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		Client client = new Client("127.0.0.1", 5000);
	}

}
