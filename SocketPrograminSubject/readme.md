# Basit Soket Programlama ile İstemci-Sunucu Uygulaması
Bu projede, Java dilini kullanarak basit bir istemci-sunucu iletişim uygulaması geliştirilmiştir. Bu uygulama, istemci ve sunucu arasında metin tabanlı veri alışverişi yapar.

## Sunucu (Server) Uygulaması
Sunucu uygulaması, istemcinin bağlanmasını bekler ve bağlantıyı kabul ettikten sonra istemcinin gönderdiği metin mesajlarını alır.

## Nasıl Çalışır?
- Sunucu, belirli bir bağlantı noktasında (port) başlatılır.
- Bir istemci bağlanmayı bekler.
- Bir istemci bağlandığında, sunucu bağlantıyı kabul eder ve istemciden gelen verileri alır.
- Sunucu, istemciden gelen verileri okur ve konsola yazdırır.
- İstemci, "Bitti" kelimesini gönderene kadar sunucu, istemciden gelen verileri okumaya devam eder.
- İstemci "Bitti" kelimesini gönderdiğinde, sunucu bağlantıyı sonlandırır.
- İstemci (Client) Uygulaması
- İstemci uygulaması, belirli bir sunucu adresine ve bağlantı noktasına bağlanarak metin tabanlı veri gönderebilir.

## Nasıl Çalışır?
- İstemci, belirli bir sunucu adresine ve bağlantı noktasına bağlanır.
- İstemci, kullanıcıdan metin girmesini bekler ve bu metni sunucuya gönderir.
- İstemci, "Bitti" kelimesini gönderene kadar kullanıcıdan metin almayı ve sunucuya göndermeyi sürdürür.
- Kullanıcı "Bitti" kelimesini girip gönderdiğinde, istemci bağlantıyı sonlandırır.

## Nasıl Kullanılır?
- İlk olarak, sunucu uygulamasını başlatın. Sunucu, belirli bir bağlantı noktasında (örneğin, 5000) başlayacaktır.
- Ardından, istemci uygulamasını başlatın ve sunucu adresini (genellikle "localhost" veya "127.0.0.1") ve aynı bağlantı noktasını belirtin (örneğin, 5000).
- İstemci başladıktan sonra, konsola metin girmeye başlayabilirsiniz. Girilen metinler sunucuya gönderilecek ve sunucu tarafından konsola yazdırılacaktır.
- İstemci tarafında "Bitti" yazarak mesaj göndermeyi sonlandırabilirsiniz. Bu durumda, bağlantılar sonlandırılacak ve uygulamalar kapatılacaktır.

![image](https://github.com/esmanur-karatas/SocketProgramming/assets/83882274/15c8436a-51db-4a05-a34f-4b0d720fe514)
![image](https://github.com/esmanur-karatas/SocketProgramming/assets/83882274/04e51ae9-431b-4de8-9213-80c11f74beb6)
