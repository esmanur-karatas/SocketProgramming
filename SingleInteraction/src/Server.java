import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

	private static final int PORT = 5001;
	
	public static void main(String[] args) throws IOException {
	
		ServerSocket sunucu = new ServerSocket(PORT);
		System.out.println("[SUNUCU] Bir istemcinin bağlanması bekleniyor...");
		Socket client = sunucu.accept();
		System.out.println("[SERVER] Bir istemci bağlandı!");
		
		while(true) {
		PrintWriter output = new PrintWriter(client.getOutputStream());
		output.println((new Date()).toString());
		client = sunucu.accept();
		}
//		System.out.println("[SUNUCU] Tarih bilgisi gönderildi. Bağlantı kapatılıyor.");
//		client.close();
//		sunucu.close();
	}

}
