## Basit İstemci-Sunucu Uygulaması
Bu Java projesi, basit bir istemci-sunucu iletişim uygulamasını gerçekleştirir. Sunucu, istemcinin isteğine göre rastgele bir kişi ve meslek bilgisini döndürür.

## Sunucu (Server) Uygulaması
Sunucu uygulaması, belirli bir bağlantı noktasında (port) başlatılır ve istemcilerin bağlanmasını bekler. İstemcilerin isteğine göre rastgele bir kişi ve meslek bilgisi döndürür.

## Nasıl Çalışır?
- Sunucu, belirli bir bağlantı noktasında (örneğin, 5001) başlatılır.
- Bir istemcinin bağlanması beklenir.
- Bir istemci bağlandığında, sunucu bağlantıyı kabul eder ve istemcinin isteğini bekler.
- İstemcinin isteğine göre, rastgele bir kişi ve meslek bilgisi döndürülür.
- İstemci "Bitti" kelimesini gönderdiğinde, sunucu bağlantıyı sonlandırır ve kapanır.
- İstemci (Client) Uygulaması
- İstemci uygulaması, sunucuya bağlanarak rastgele bir kişi ve meslek bilgisi isteyebilir. Kullanıcı, istemci uygulaması aracılığıyla sunucuya istek gönderebilir ve sunucudan gelen cevabı alabilir.

## Nasıl Çalışır?
- İstemci, sunucu IP adresini (genellikle "localhost" veya "127.0.0.1") ve bağlantı noktasını (örneğin, 5001) belirterek sunucuya bağlanır.
- Kullanıcı, istemciye isteği yazarak gönderebilir. İstekler arasında "bir kişi söyle" yazarak rastgele bir kişi ve meslek bilgisi alabilir veya "Bitti" yazarak sunucu bağlantısını sonlandırabilir.
- İstemci, sunucudan gelen cevabı konsola yazdırır.
- Kullanıcı "Bitti" komutunu göndererek istemciyi kapatır.

## Nasıl Kullanılır?
- İlk olarak, sunucu uygulamasını başlatın. Sunucu, belirli bir bağlantı noktasında (örneğin, 5001) başlayacaktır.
- Ardından, istemci uygulamasını başlatın ve sunucu IP adresini (genellikle "localhost" veya "127.0.0.1") ve aynı bağlantı noktasını belirtin (örneğin, 5001).
- İstemci başladıktan sonra, konsola istediğiniz komutları girerek sunucudan cevap alabilirsiniz.
- İstemci tarafında "Bitti" komutunu girerek sunucu bağlantısını sonlandırabilirsiniz.
