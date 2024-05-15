import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
//	SERVER SİDE PROGRAMMİNG
//	-Soket bağlantısı kurmak
	private Socket socket = null;
//	server içinde socket bağlantısı kurduk.
	private ServerSocket server = null;
	private DataInputStream input = null;
	
//	istemcinin isteğini bekletmeden önce bir port bilgisi lazım 
	public Server (int port) throws IOException {
		server = new ServerSocket(port);
		System.out.println("Sunucu Başlatıldı...");
		
//		-İstemcinin isteğini bekler.
		System.out.println("Bir client(istemci) bekleniyor...");
		socket = server.accept();
		System.out.println("Bir istemci kabul edildi!");
		
//		istemcinin soketinden girdi alınıyor
		input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		String metin = "";
		while(!metin.equals("Bitti")) {
//		UTF Karakterinde okuyoruz.
		metin = input.readUTF();
		System.out.println(metin);
	}
		
		System.out.println("Bağlantı sonlandırılıyor...");
		input.close();
		socket.close();
}

	public static void main(String[] args) throws IOException {
		Server server = new Server(5000);
	}

}
