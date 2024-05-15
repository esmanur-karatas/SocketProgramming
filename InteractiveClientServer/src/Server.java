import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Server {

	private static String[] isimler = {"Ahmet", "Esma", "Nur", "Faruk"};
	private static String[] meslekler = {"Muhasebeci" , "Programcı", "Doktor", "Polis"};
	private static final int PORT = 5001;
	
	public static void main(String[] args) throws IOException {
		ServerSocket sunucu = new ServerSocket(PORT);
		System.out.println("[SERVER] --> Bir istemcinin bağlanması bekleniyor...");
		
		Socket client = sunucu.accept();
		System.out.println("[SERVER] --> Bir istemci bağlandı...");
		
		PrintWriter output = new PrintWriter(client.getOutputStream(),true);
		BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		while(true) {
			String clientRequest = input.readLine();
			
			if(clientRequest.contains("bir kişi söyle")) {
				output.println(rastgeleKisiSec());
			}
			else if (clientRequest.equals("Bitti")) {
				output.println("Hoşçakal, yine bekleriz...");
				System.out.println("SUNUCU KAPATILDI");
				break;
			}
			else {
			  output.println("Kişi bilgisi giriniz!");
			}
		}
		output.close();
		input.close();
		
	}
	
	public static String rastgeleKisiSec() {
		int no =(int)(Math.random() * isimler.length);
		return isimler[no] + " " + meslekler[no];
	}

}
